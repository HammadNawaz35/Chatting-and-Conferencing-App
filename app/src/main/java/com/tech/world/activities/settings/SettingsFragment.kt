package com.tech.world.activities.settings

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Switch
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import androidx.navigation.Navigation
import com.tech.world.R
import com.tech.world.activities.main.LocaleHelperClass
import kotlinx.android.synthetic.main.fragment_settings.*


class SettingsFragment : Fragment(), View.OnClickListener {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view: View = inflater!!.inflate(R.layout.fragment_settings, container, false)

        val switch:Switch=view.findViewById(R.id.themee);
//        val switchs:Switch=view.findViewById(R.id.lang);
//        switchs.setOnCheckedChangeListener { buttonview, isChecked ->
//            if (isChecked) {
//               Context context = LocaleHelperClass.setLocale(activity, "en");
//                resources = context.getResources();
//            } else {
//                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
//            }
//
//        }

        switch.setOnCheckedChangeListener { buttonview, isChecked ->
            if (isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }

        }
        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        tv_profile.setOnClickListener(this)
        tv_notifications.setOnClickListener(this)
        tv_security.setOnClickListener(this)
        tv_chat.setOnClickListener(this)
        tv_privacy_policy.setOnClickListener(this)
        tv_about.setOnClickListener(this)
        themee.setOnClickListener(this)
    }


    override fun onClick(view: View) {

        when (view.id) {

            R.id.tv_profile -> Navigation.findNavController(view).navigate(R.id.action_settingsFragment_to_profilePreferenceFragment)


            R.id.tv_notifications -> Navigation.findNavController(view).navigate(R.id.action_settingsFragment_to_notificationPreferenceFragment)
            R.id.tv_security -> Navigation.findNavController(view).navigate(R.id.action_settingsFragment_to_securityPreferencesFragment)
            R.id.tv_chat -> Navigation.findNavController(view).navigate(R.id.action_settingsFragment_to_chatSettingsPreferenceFragment2)
            R.id.tv_privacy_policy -> Navigation.findNavController(view).navigate(R.id.action_settingsFragment_to_privacyPolicyFragment)
            R.id.tv_about -> Navigation.findNavController(view).navigate(R.id.action_settingsFragment_to_aboutFragment2)


        }
    }

}