package com.tech.world.activities.main

import android.Manifest.permission.CAMERA
import android.animation.Animator
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.PowerManager
import android.provider.Settings
import android.view.ActionMode
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.SearchView
import androidx.appcompat.widget.Toolbar
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager.widget.ViewPager
import com.tech.world.R
import com.tech.world.activities.*
import com.tech.world.activities.settings.SettingsActivity
import com.tech.world.adapters.ViewPagerAdapter
import com.tech.world.common.ViewModelFactory
import com.tech.world.common.extensions.findFragmentByTagForViewPager
import com.tech.world.events.ExitUpdateActivityEvent
import com.tech.world.extensions.observeValueEvent
import com.tech.world.fragments.BaseFragment
import com.tech.world.interfaces.FragmentCallback
import com.tech.world.interfaces.StatusFragmentCallbacks
import com.tech.world.job.DailyBackupJob
import com.tech.world.job.SaveTokenJob
import com.tech.world.job.SetLastSeenJob
import com.tech.world.model.realms.User
import com.tech.world.services.FCMRegistrationService
import com.tech.world.services.InternetConnectedListener
import com.tech.world.services.NetworkService
import com.tech.world.utils.*
import com.tech.world.utils.network.FireManager
import com.tech.world.views.dialogs.IgnoreBatteryDialog
import com.tech.world.views.sticker.StickerLoader
import com.droidninja.imageeditengine.ImageEditor
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.tabs.TabLayout
import com.karumi.dexter.Dexter
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.PermissionDeniedResponse
import com.karumi.dexter.listener.PermissionGrantedResponse
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.single.PermissionListener
import io.reactivex.rxkotlin.addTo
import org.greenrobot.eventbus.EventBus


class MainActivity : BaseActivity(), FabRotationAnimation.RotateAnimationListener, FragmentCallback,
    StatusFragmentCallbacks {
    private var isInSearchMode = false

    private lateinit var fab: FloatingActionButton
    private lateinit var textStatusFab: FloatingActionButton

    private lateinit var toolbar: Toolbar
    private lateinit var tvSelectedChatCount: TextView
    private lateinit var searchView: SearchView
    private lateinit var viewPager: ViewPager
    private lateinit var tabLayout: TabLayout


    private var users: List<User>? = null
    private var fireListener: FireListener? = null
    private var adapter: ViewPagerAdapter? = null
    private lateinit var rotationAnimation: FabRotationAnimation
    private var root: CoordinatorLayout? = null

    private var currentPage = 0

    private lateinit var viewModel: MainViewModel

    private var ignoreBatteryDialog: IgnoreBatteryDialog? = null


    override fun enablePresence(): Boolean {
        return true
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()

        viewModel = ViewModelProvider(
            this,
            ViewModelFactory(this.application)
        ).get(MainViewModel::class.java)


        setSupportActionBar(toolbar)

        rotationAnimation = FabRotationAnimation(this)

        fireListener = FireListener()
        startServices()


        users = RealmHelper.getInstance().listOfUsers

        fab.setOnClickListener {
            when (currentPage) {
                0 -> startActivity(Intent(this@MainActivity, NewChatActivity::class.java))
                1 -> startCamera()
                2 -> startActivity(Intent(this@MainActivity, NewCallActivity::class.java))
                3 -> startActivity(Intent(this@MainActivity, MeetingActivity::class.java))
            }
        }

        textStatusFab.setOnClickListener {
            startActivityForResult(
                Intent(
                    this,
                    TextStatusActivity::class.java
                ), REQUEST_CODE_TEXT_STATUS
            )
        }


        viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) = Unit

            //onSwipe or tab change
            override fun onPageSelected(position: Int) {
                currentPage = position
                if (isInSearchMode)
                    exitSearchMode()

                when (position) {


                    //add margin to fab when tab is changed only if ads are shown
                    //animate fab with rotation animation also
                    0 -> {
                        getFragmentByPosition(0)?.let { fragment ->
                            val baseFragment = fragment as BaseFragment
                            addMarginToFab(baseFragment.isVisible && baseFragment.isAdShowing)
                        }

                        animateFab(R.drawable.ic_chat)
                    }
                    1 -> {
                        getFragmentByPosition(1)?.let { fragment ->
                            val baseFragment = fragment as BaseFragment
                            addMarginToFab(baseFragment.isVisible && baseFragment.isAdShowing)
                        }
                        animateFab(R.drawable.ic_photo_camera)
                    }

                    2 -> {

                        getFragmentByPosition(2)?.let { fragment ->
                            val baseFragment = fragment as BaseFragment
                            addMarginToFab(baseFragment.isVisible && baseFragment.isAdShowing)
                        }
                        animateFab(R.drawable.ic_phone)
                    }
                    3-> {

                        getFragmentByPosition(3)?.let { fragment ->
                            val baseFragment = fragment as BaseFragment
                            addMarginToFab(baseFragment.isVisible && baseFragment.isAdShowing)
                        }
                        animateFab(R.drawable.ic_person)
                    }



                }
            }

            override fun onPageScrollStateChanged(state: Int) = Unit
        })

        //revert status fab to starting position
        textStatusFab.addOnHideAnimationListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(animation: Animator) = Unit

            override fun onAnimationEnd(animation: Animator) {
                textStatusFab.animate().y(fab.y).start()
            }

            override fun onAnimationCancel(animation: Animator) = Unit

            override fun onAnimationRepeat(animation: Animator) = Unit
        })


        viewModel.saveAppVersion()

        if (!SharedPreferencesManager.hasAgreedToPrivacyPolicy()) {
//            showPrivacyAlertDialog()
        } else if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP_MR1) {
            try {
                val pkg = packageName
                val pm = getSystemService(PowerManager::class.java)
                val showDialog = resources.getBoolean(R.bool.ignore_battery_optimizations_dialog);
                if (showDialog && !pm.isIgnoringBatteryOptimizations(pkg) && !SharedPreferencesManager.isDoNotShowBatteryOptimizationAgain()) {
//                    showBatteryOptimizationDialog()
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        viewModel.deleteOldMessagesIfNeeded()
        viewModel.checkForUpdate().subscribe({ needsUpdate ->
            if (needsUpdate) {
                startUpdateActivity()
            } else {
                EventBus.getDefault().post(ExitUpdateActivityEvent())
            }
        }, {

        })

        viewModel.setupE2eIfNeeded()

        listenForDeviceIdChange()

    }


    private fun listenForDeviceIdChange() {
        FireConstants.deviceIdRef.child(FireManager.uid).observeValueEvent()
            .subscribe { dataSnapshot ->
                if (dataSnapshot.value != null && (dataSnapshot.value as? String) != DeviceId.id) {
                    startLoggedOutActivity()
                    FireManager.logout()
                    NotificationHelper(this@MainActivity).fireUserLoggedOutNotification()
                    finish()
                } else {
                }
            }.addTo(disposables)
    }


    override fun goingToUpdateActivity() {
        ignoreBatteryDialog?.dismiss()
        super.goingToUpdateActivity()
    }


    //for users who updated the app
//    private fun showPrivacyAlertDialog() {
//        val alertDialog = AlertDialog.Builder(this)
//        alertDialog.setPositiveButton(R.string.agree_and_continue) { dialog, which ->
//            SharedPreferencesManager.setAgreedToPrivacyPolicy(true)
//        }
//
//        alertDialog.setNegativeButton(R.string.cancel) { dialog, which ->
//            finish()
//        }
//
//        alertDialog.show()
//    }

    private fun showBatteryOptimizationDialog() {

        ignoreBatteryDialog = IgnoreBatteryDialog(this, R.style.AlertDialogTheme)

        ignoreBatteryDialog?.setOnDialogClickListener(object :
            IgnoreBatteryDialog.OnDialogClickListener {

            override fun onCancelClick(checkBoxChecked: Boolean) {
                SharedPreferencesManager.setDoNotShowBatteryOptimizationAgain(checkBoxChecked)
            }

            override fun onDismiss(checkBoxChecked: Boolean) {
                SharedPreferencesManager.setDoNotShowBatteryOptimizationAgain(checkBoxChecked)
            }

            override fun onOk() {
                try {
                    val intent = Intent()
                    intent.action = Settings.ACTION_IGNORE_BATTERY_OPTIMIZATION_SETTINGS
                    startActivity(intent)
                } catch (e: Exception) {
                    Toast.makeText(
                        this@MainActivity,
                        "could not open Battery Optimization Settings",
                        Toast.LENGTH_SHORT
                    ).show();
                }
            }
        })
        ignoreBatteryDialog?.show()
    }


    //start CameraActivity
    private fun startCamera() {
        Dexter.withContext(this)
            .withPermission(CAMERA)
            .withListener(object : PermissionListener {
                override fun onPermissionGranted(p0: PermissionGrantedResponse?) {
                    val intent = Intent(this@MainActivity, CameraActivity::class.java)
                    intent.putExtra(IntentUtils.CAMERA_VIEW_SHOW_PICK_IMAGE_BUTTON, true)
                    intent.putExtra(IntentUtils.IS_STATUS, true)
                    startActivityForResult(intent, CAMERA_REQUEST)
                }

                override fun onPermissionDenied(p0: PermissionDeniedResponse?) {
                }

                override fun onPermissionRationaleShouldBeShown(
                    p0: PermissionRequest?,
                    p1: PermissionToken?
                ) {
                    Toast.makeText(
                        this@MainActivity,
                        R.string.missing_permissions,
                        Toast.LENGTH_SHORT
                    ).show();
                }
            }).check()


    }

    //animate FAB with rotation animation
    @SuppressLint("RestrictedApi")
    private fun animateFab(drawable: Int) {
        val animation = rotationAnimation.start(drawable)
        fab.startAnimation(animation)
    }

    private fun animateTextStatusFab() {
        val show = viewPager.currentItem == 1
        if (show) {
            textStatusFab.show()
            textStatusFab.animate().y(fab.top - DpUtil.toPixel(70f, this)).start()
        } else {
            textStatusFab.hide()
            textStatusFab.layoutParams = fab.layoutParams
        }
    }


    override fun fetchStatuses() {
        users?.let {
            viewModel.fetchStatuses(it)
        }
    }


    private fun startServices() {
        if (!BuildVerUtil.isOreoOrAbove()) {
            startService(Intent(this, NetworkService::class.java))
            startService(Intent(this, InternetConnectedListener::class.java))
            startService(Intent(this, FCMRegistrationService::class.java))

        } else {
            if (!SharedPreferencesManager.isTokenSaved())
                SaveTokenJob.schedule(this, null)

            SetLastSeenJob.schedule(this)
            UnProcessedJobs.process(this)
        }

        //sync contacts for the first time
        if (!SharedPreferencesManager.isContactSynced()) {
            syncContacts()
        } else {
            //sync contacts every day if needed
            if (SharedPreferencesManager.needsSyncContacts()) {
                syncContacts()
            }
        }

        //schedule daily job to backup messages
        DailyBackupJob.schedule()

        StickerLoader(this).loadStickersIntoFilesDir()

        if (!SharedPreferencesManager.isDeviceIdSaved()) {
            viewModel.saveDeviceId()
        }

    }

    private fun syncContacts() {
        disposables.add(ContactUtils.syncContacts().subscribe({

        }, { throwable ->

        }))
    }


    private fun init() {
        fab = findViewById(R.id.open_new_chat_fab)
        toolbar = findViewById(R.id.toolbar)
        tvSelectedChatCount = findViewById(R.id.tv_selected_chat)
        viewPager = findViewById(R.id.view_pager)
        tabLayout = findViewById(R.id.tab_layout)
        textStatusFab = findViewById(R.id.text_status_fab)
        root = findViewById(R.id.root)

        initTabLayout()

        //prefix for a bug in older APIs
        fab.bringToFront()
    }

    private fun initTabLayout() {
        tabLayout.setupWithViewPager(viewPager)
        adapter = ViewPagerAdapter(
            supportFragmentManager,
            FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
        )
        viewPager.adapter = adapter
        viewPager.offscreenPageLimit = 1
        setTabsTitles(4)
    }


    override fun onPause() {
        super.onPause()
        ignoreBatteryDialog?.dismiss()
        fireListener?.cleanup()
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        val menuItem = menu.findItem(R.id.search_item)
        searchView = menuItem.actionView as SearchView
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {

                return false
            }

            //submit search for the current active fragment
            override fun onQueryTextChange(newText: String): Boolean {
                viewModel.onQueryTextChange(newText)
                return false
            }

        })
        //revert back to original adapter
        searchView.setOnCloseListener {
            exitSearchMode()
            true
        }

        menuItem.setOnActionExpandListener(object : MenuItem.OnActionExpandListener {
            override fun onMenuItemActionExpand(menuItem: MenuItem): Boolean {
                return true
            }

            //exit search mode on searchClosed
            override fun onMenuItemActionCollapse(menuItem: MenuItem): Boolean {
                exitSearchMode()
                return true
            }
        })

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {

            R.id.settings_item -> settingsItemClicked()

            R.id.search_item -> searchItemClicked()

            R.id.new_group_item -> createGroupClicked()

//            R.id.theme-> {
//                if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
//                    setTheme(R.style.darkTheme)
//                } else {
//                    setTheme(R.style.AppTheme)
//                }


//                switchtheme.setOnCheckedChangeListener { _, isChecked ->
//                    if (isChecked) {
//                        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
//                    } else {
//                        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
//                    }
//
//                }

//            }
            R.id.invite_item -> startActivity(IntentUtils.getShareAppIntent(this@MainActivity))

            R.id.new_broadcast_item -> {

                val intent = Intent(this@MainActivity, NewGroupActivity::class.java)
                intent.putExtra(IntentUtils.IS_BROADCAST, true)
                startActivity(intent)
            }
        }

        return super.onOptionsItemSelected(item)
    }


    private fun createGroupClicked() {
        startActivity(Intent(this, NewGroupActivity::class.java))
    }

    private fun searchItemClicked() {
        isInSearchMode = true
    }


    private fun settingsItemClicked() {
        val intent = Intent(this, SettingsActivity::class.java)
        startActivity(intent)
    }


    override fun onBackPressed() {
        if (isInSearchMode)
            exitSearchMode()
        else {
            if (viewPager.currentItem != CHATS_TAB_INDEX) {
                viewPager.setCurrentItem(CHATS_TAB_INDEX, true)
            } else {
                super.onBackPressed()
            }
        }

    }


    fun exitSearchMode() {
        isInSearchMode = false
    }


    private fun setTabsTitles(tabsSize: Int) {
        for (i in 0 until tabsSize) {
            when (i) {

                0 -> tabLayout.getTabAt(i)?.setText(R.string.chats)

                1 -> tabLayout.getTabAt(i)?.setText(R.string.status)

                2 -> tabLayout.getTabAt(i)?.setText(R.string.calls)

                3 -> tabLayout.getTabAt(i)?.setText(R.string.meetings)
            }
        }

    }


    override fun onRotationAnimationEnd(drawable: Int) {
        fab?.setImageResource(drawable)
        animateTextStatusFab()
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == CAMERA_REQUEST || requestCode == ImageEditor.RC_IMAGE_EDITOR || requestCode == REQUEST_CODE_TEXT_STATUS) {
            viewModel.onActivityResult(requestCode, resultCode, data)

        }

    }


    override fun addMarginToFab(isAdShowing: Boolean) {
        val layoutParams = fab.layoutParams as CoordinatorLayout.LayoutParams
        val v = if (isAdShowing) DpUtil.toPixel(
            95f,
            this
        ) else resources.getDimensionPixelSize(R.dimen.fab_margin).toFloat()


        layoutParams.bottomMargin = v.toInt()

        fab.layoutParams = layoutParams

        fab.clearAnimation()
        fab.animation?.cancel()

        animateTextStatusFab()

    }


    override fun openCamera() {
        startCamera()
    }

    override fun startTheActionMode(callback: ActionMode.Callback) {
        startActionMode(callback)
    }

    private fun getFragmentByPosition(position: Int): Fragment? {
        return viewPager.currentItem?.let {
            supportFragmentManager.findFragmentByTagForViewPager(
                position,
                it
            )
        }
    }


    companion object {
        const val CAMERA_REQUEST = 9514
        const val REQUEST_CODE_TEXT_STATUS = 9145
        private const val CHATS_TAB_INDEX = 0

    }


}