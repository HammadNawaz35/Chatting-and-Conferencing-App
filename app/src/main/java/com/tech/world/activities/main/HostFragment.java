package com.tech.world.activities.main;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.snackbar.Snackbar;
import com.tech.world.R;
import com.tech.world.activities.ContactDetailsActivity;
import com.tech.world.utils.NetworkHelper;


import android.content.Intent;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.jitsi.meet.sdk.JitsiMeet;
import org.jitsi.meet.sdk.JitsiMeetActivity;
import org.jitsi.meet.sdk.JitsiMeetConferenceOptions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HostFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HostFragment extends Fragment {
    EditText code, mcode;
    ProgressDialog progressDialog;
    TextView join, share;
    Animation fin, fout, sin, sout, sleft, sright, sup, sdown;
    LinearLayout linear1;
    ProgressDialog progressDoalog;
    EditText duration;
    TextView mdatetime;
    int count=15;

    ImageView clink, durationbtn,rstring;
    Intent shareIntent;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HostFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment  code = view.findViewById(R.id.codebox);
     * //            join = view.findViewById(R.id.joinbtn);
     * //            share = view.findViewById(R.id.sharebtn);
     * ////       getSupportActionBar().setTitle("Meetings");Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HostFragment newInstance(String param1, String param2) {
        HostFragment fragment = new HostFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_host, container, false);


        linear1 = (LinearLayout) v.findViewById(R.id.l1);
        fin = AnimationUtils.loadAnimation(getActivity(), R.anim.slide_up);
        linear1.setAnimation(fin);


        code = v.findViewById(R.id.codebox);
        duration = v.findViewById(R.id.mduration);
        durationbtn = v.findViewById(R.id.durbtn);

        mcode = v.findViewById(R.id.mcodebox);
        clink = v.findViewById(R.id.copylink);
        mdatetime = v.findViewById(R.id.mdate);
//        Date currentTime = Calendar.getInstance().getTime();
        Date dateCurrent = Calendar.getInstance().getTime();
        mdatetime.setText(dateCurrent.toString());


        join = v.findViewById(R.id.joinbtn);
//       rstring = v.findViewById(R.id.mstring);


//        startActivity(new Intent(getContext(),MeetingHistoryActivity.class));

        code.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                final int DRAWABLE_LEFT = 0;
                final int DRAWABLE_TOP = 1;
                final int DRAWABLE_RIGHT = 2;
                final int DRAWABLE_BOTTOM = 3;


                if(event.getAction() == MotionEvent.ACTION_UP) {
//                    if(event.getRawX() >= (editComment.getRight() - editComment.getCompoundDrawables()[DRAWABLE_RIGHT].getBounds().width())) {

                        if(event.getX() <= (code.getCompoundDrawables()[DRAWABLE_LEFT].getBounds().width()))  {
                        // your action here
                          code.setText(getRandomString(9));


                        return true;
                    }
                }
                return false;
            }
        });

//       rstring.setOnClickListener(new View.OnClickListener() {
//           @Override
//           public void onClick(View view) {
////               code.setText(getRandomString(9));
//           }
//       });
//         imageView=v.findViewById(R.id.simage);

        share = v.findViewById(R.id.sharebtn);







        durationbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                count=count+30;
                 duration.setText(""+ count +getString(R.string.min));
            }
        });
       mcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Copycode();
//                PasteCode();

            }
        });

        clink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            btnCopycode();

            }
        });


        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String mcodebox = mcode.getText().toString();

                if (mcodebox.isEmpty()) {
                    mcode.setError("Enter Meeting title");
                } else {


//                   imageView.setVisibility(View.VISIBLE);
//                   Drawable mDrawable = imageView.getDrawable();
//                   Bitmap mBitmap = ((BitmapDrawable) mDrawable).getBitmap();
//                    sharingIntent.putExtra(Intent.EXTRA_STREAM, uri);
//                   String path = MediaStore.Images.Media.insertImage(getActivity().getContentResolver(), mBitmap, "Image Description", null);
//                   Uri uri = Uri.parse(path);

//
                    Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                    sharingIntent.setType("text/plain");
//
                    String shareBody = getString(R.string.cloud1) + getString(R.string.meeting_title) + mcode.getText().toString() + getString(R.string.space) + getString(R.string.cdate)
                            + mdatetime.getText().toString() + getString(R.string.zspace) + getString(R.string.zone) + getString(R.string.space)
                            + getString(R.string.duration)+ duration.getText().toString()
                            + getString(R.string.space)
                            + getString(R.string.sharetext) + code.getText().toString() + getString(R.string.space) + getString(R.string.sharetextsite)
                            + code.getText().toString();
                    sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "fdfdfffff");

                    sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                    startActivity(Intent.createChooser(sharingIntent, "Share via"));
                }
            }
        });


        join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!NetworkHelper.isConnected(getActivity())) {
                    Toast.makeText(getActivity(), "No Internet Connection. Plz Connect to Internet & Try again.!!", Toast.LENGTH_LONG).show();
//            Snackbar.make(v.findViewById(android.R.id.content), R.string.no_internet_connection, Snackbar.LENGTH_SHORT).show();

                }

//               if (NetworkHelper.isConnected(getActivity())) {
//                    Toast.makeText(getActivity(), "Creating Meeting Link!!", Toast.LENGTH_LONG).show();
////            Snackbar.make(v.findViewById(android.R.id.content), R.string.no_internet_connection, Snackbar.LENGTH_SHORT).show();
//
//                }
                else {









//
//                    URL url;
//                    try {
//                        url = new URL("https://meet.jit.si");
//                        JitsiMeetConferenceOptions defaultoptions = new JitsiMeetConferenceOptions.Builder()
//                                .setServerURL(url).setWelcomePageEnabled(false).setVideoMuted(false).setFeatureFlag("invite.enabled", false)
//                                .setFeatureFlag("meeting-name.enabled", true).setFeatureFlag("meeting-password.enabled", true)
//                                .setFeatureFlag("video-mute.enabled", true).setFeatureFlag("welcomepage.enabled", false).build();
//                        JitsiMeet.setDefaultConferenceOptions(defaultoptions);
//                    } catch (MalformedURLException e) {
//                        e.printStackTrace();
//                    }




                String codebox = code.getText().toString();
                String mcodebox = mcode.getText().toString();
                String durat = duration.getText().toString();
                if (codebox.isEmpty()) {
                    code.setError("Meeting code can not be empty");
                }
                else if (mcodebox.isEmpty()) {
                    mcode.setError("Meeting title can not be empty");
                } else if (durat.isEmpty()) {
                    duration.setError("Select Meeting Duration");
                }
                else if (codebox.length() <= 6) {
                    code.setError("Meeting code should not be less than 6 digits");

                } else if (codebox.length() >= 10) {
                    code.setError("Meeting code should not exceed than 10 digits");

                } else {




//                    Intent intent=new Intent(getActivity(),MeetingHistoryActivity.class);
                    SharedPreferences sharedPref = getActivity().getSharedPreferences("myKey", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPref.edit();
                    editor.putString("title", mcode.getText().toString());
                    editor.putString("id", code.getText().toString());
                    editor.putString("time", mdatetime.getText().toString());
                    editor.apply();
//                        intent.putExtra("title",mcode.getText().toString());
//                        intent.putExtra("id",code.getText().toString());
//                   intent.putExtra("time",mdatetime.getText().toString());
//                        Toast.makeText(getActivity(), "Creating your Meeting !!", Toast.LENGTH_LONG).show();
//                        startActivity(intent);


                    progressDialog = new ProgressDialog(getActivity());
                    progressDialog.setMessage("Loading..."); // Setting Message
                    progressDialog.setTitle("Creating Meeting "); // Setting Title
                    progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER); // Progress Dialog Style Spinner
                    progressDialog.show(); // Display Progress Dialog
                    progressDialog.setCancelable(false);

                    Thread thread=new Thread()
                    {
                        public  void run(){
                            try {
                                sleep(5000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            finally {
                                startActivity(new Intent(getActivity(),MeetingHistoryActivity.class));

//                                Toast.makeText(getActivity(), "Meeting created...", Toast.LENGTH_SHORT).show();
                            }
                            progressDialog.dismiss();

                        }
                    };thread.start();


//
//                    progressDoalog = new ProgressDialog(getActivity());
//                    progressDoalog.setMax(100);
//                    progressDoalog.setMessage("Please wait creating meeting...");
//                    progressDoalog.setTitle("Host Meetings");
//                    progressDoalog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
//                    progressDoalog.show();
//                    final Handler handle = new Handler() {
//                        @Override
//                        public void handleMessage(Message msg) {
//                            super.handleMessage(msg);
//                            progressDoalog.incrementProgressBy(1);
//                        }
//                    };
//                    new Thread(new Runnable() {
//                        @Override
//                        public void run() {
//                            try {
//                                while (progressDoalog.getProgress() <= progressDoalog
//                                        .getMax()) {
//                                    Thread.sleep(900);
//                                    handle.sendMessage(handle.obtainMessage());
//                                    if (progressDoalog.getProgress() == progressDoalog
//                                            .getMax()) {
//                                        progressDoalog.dismiss();
//                                    }
//                                }
//                            } catch (Exception e) {
//                                e.printStackTrace();
//                            }
//                        }
//                    }).start();


//                    JitsiMeetConferenceOptions options = new JitsiMeetConferenceOptions.Builder().setRoom(code.getText().toString()).setWelcomePageEnabled(false).build();
//                    JitsiMeetActivity.launch(getContext(), options);
                }
                }
            }
        });

//                    .setFeatureFlag("Kick-out.enabled",false)

        return v;


    }

    private void PasteCode() {

      ClipboardManager  clipboardManager=(ClipboardManager)getActivity().getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clipData=clipboardManager.getPrimaryClip();
        ClipData.Item item=clipData.getItemAt(0);
        code.setText(item.getText().toString());
        clipboardManager.setPrimaryClip(clipData);


    }




    private void btnCopycode() {

        String text = code.getText().toString();
        ClipboardManager clipboardManager = (ClipboardManager) getActivity().getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clipData = ClipData.newPlainText("text", text);
        clipboardManager.setPrimaryClip(clipData);
        Toast.makeText(getContext(), "Copied ", Toast.LENGTH_SHORT).show();
    }

    private void Copycode() {

        String text = code.getText().toString();
        ClipboardManager clipboardManager = (ClipboardManager) getActivity().getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clipData = ClipData.newPlainText("text", text);
        clipboardManager.setPrimaryClip(clipData);






    }


    public String getRandomString(int i) {




        final String characters = "Abcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder result = new StringBuilder();
        while (i > 0) {
            Random random = new Random();
            result.append(characters.charAt(random.nextInt(characters.length())));
            i--;

        }

        return result.toString();



    }

}


