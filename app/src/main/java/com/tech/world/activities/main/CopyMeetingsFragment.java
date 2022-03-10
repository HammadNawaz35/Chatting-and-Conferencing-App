//package com.tech.world.activities.main;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.view.animation.Animation;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.RelativeLayout;
//import android.widget.TextView;
//import android.widget.VideoView;
//
//import androidx.fragment.app.Fragment;
//
//import com.tech.world.R;
//
//import org.jitsi.meet.sdk.JitsiMeet;
//import org.jitsi.meet.sdk.JitsiMeetActivity;
//import org.jitsi.meet.sdk.JitsiMeetConferenceOptions;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//
//
//public class CopyMeetingsFragment extends Fragment {
//
//
//    public CopyMeetingsFragment() {
//        // Required empty public constructor
//    }
//
//
//
//
//    EditText code;
//    TextView join, share;
//    Button logout, cancel;
//    VideoView videoView;
//    RelativeLayout relativeLayout;
//    Animation fout;
//    private JitsiMeetConferenceOptions jitsiMeetConferenceOptions;
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//       View view = inflater.inflate(R.layout.fragment_meetings, container, false);
//
//
//
//
//
//
//            code = view.findViewById(R.id.codebox);
//            join = view.findViewById(R.id.joinbtn);
//            share = view.findViewById(R.id.sharebtn);
////       getSupportActionBar().setTitle("Meetings");
//
////        relativeLayout=findViewById(R.id.rl);
////
////        fout= AnimationUtils.loadAnimation(this,R.anim.slide_down);
////        relativeLayout.setAnimation(fout);
//
//            share.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Intent myIntent = new Intent(Intent.ACTION_SEND);
//                    myIntent.setType("text/plain");
//                    String shareBody = "Ener this  code to join in meeting...";
////                String shareSub = " This is Amazing App you should try it Once you will never Disappoint";
////                myIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
//                    myIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
//                    startActivity(Intent.createChooser(myIntent, "Share"));
//                }
//            });
//
//
//
//
//        join.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String codebox = code.getText().toString();
//                if (codebox.isEmpty()) {
//                    code.setError("Meeting code can not be empty");
//                } else if (codebox.length() <= 6) {
//                    code.setError("Meeting code should not be less than 6 digits");
//
//                }  else if (codebox.length() >= 10) {
//                    code.setError("Meeting code should not exceed than 10 digits");
//
//                }
//                else {
//
//                    JitsiMeetConferenceOptions options = new JitsiMeetConferenceOptions.Builder().setRoom(code.getText().toString()).setWelcomePageEnabled(false).build();
//                    JitsiMeetActivity.launch(getContext(), options);
//                }
//
//            }
//        });
//
//
//            URL url;
//            try {
//                url = new URL("https://meet.jit.si");
//                JitsiMeetConferenceOptions defaultoptions = new JitsiMeetConferenceOptions.Builder()
//                        .setServerURL(url).setWelcomePageEnabled(false).build();
//                JitsiMeet.setDefaultConferenceOptions(defaultoptions);
//            } catch (MalformedURLException e) {
//                e.printStackTrace();
//            }
//        return view;
//    }
//
//}
