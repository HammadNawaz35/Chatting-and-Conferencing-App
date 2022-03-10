package com.tech.world.activities.main;


import androidx.fragment.app.Fragment;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.tech.world.R;

import org.jitsi.meet.sdk.JitsiMeet;
import org.jitsi.meet.sdk.JitsiMeetActivity;
import org.jitsi.meet.sdk.JitsiMeetConferenceOptions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link JoinFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class JoinFragment extends Fragment {
    EditText code,mcode;
    TextView join, share;
    Animation fin;
    LinearLayout linear2;

    ImageView plink;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public JoinFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment JoinFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static JoinFragment newInstance(String param1, String param2) {
        JoinFragment fragment = new JoinFragment();
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
     View v =inflater.inflate(R.layout.fragment_join, container, false);


        code = v.findViewById(R.id.jcodebox);
        mcode = v.findViewById(R.id.jcodebox);
        join = v.findViewById(R.id.jjoinbtn);
       plink= v.findViewById(R.id.jpastelink);
        share = v.findViewById(R.id.jsharebtn);

         //Animations
        linear2=(LinearLayout)v.findViewById(R.id.l2);
        fin = AnimationUtils.loadAnimation(getActivity(),R.anim.slide_left);
        linear2.setAnimation(fin);


        ClipboardManager clipboardManager=(ClipboardManager)getActivity().getSystemService(Context.CLIPBOARD_SERVICE);
        paste();
        plink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                ClipData clipData=clipboardManager.getPrimaryClip();
                ClipData.Item item=clipData.getItemAt(0);
                code.setText(item.getText().toString());
                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(getContext(), "pasted ", Toast.LENGTH_SHORT).show();

            }
        });




        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String durat = code.getText().toString();
                if (durat.isEmpty()) {
                    code.setError("Meeting ID can not be empty");
                }
                else {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");

                String shareBody = getString(R.string.sharetext)+ code.getText().toString();
                String shareSub = " This is Amazing App you should try it Once you will never Disappoint";
                myIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
                myIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(myIntent, "Share"));
            }}
        });
        join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String codebox = code.getText().toString();
                String mcodebox = mcode.getText().toString();
                if (codebox.isEmpty()) {
                    code.setError("Meeting code can not be empty");
                }
                if (mcodebox.isEmpty()) {
                    mcode.setError("Meeting title can not be empty");
                }else if (codebox.length() <= 6) {
                    code.setError("Meeting code should not be less than 6 digits");

                }  else if (codebox.length() >= 10) {
                    code.setError("Meeting code should not exceed than 10 digits");

                }
                else {

                    JitsiMeetConferenceOptions options = new JitsiMeetConferenceOptions.Builder().setRoom(code.getText().toString()).setWelcomePageEnabled(false).build();
                    JitsiMeetActivity.launch(getContext(), options);
                }

            }
        });


        URL url;
        try {
            url = new URL("https://meet.jit.si");
            JitsiMeetConferenceOptions defaultoptions = new JitsiMeetConferenceOptions.Builder()
                    .setServerURL(url).setWelcomePageEnabled(false).build();
            JitsiMeet.setDefaultConferenceOptions(defaultoptions);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return v;

    }

    private void paste() {
        ClipboardManager clipboardManager=(ClipboardManager)getActivity().getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clipData=clipboardManager.getPrimaryClip();
        ClipData.Item item=clipData.getItemAt(0);
        code.setText(item.getText().toString());
        clipboardManager.setPrimaryClip(clipData);

    }


}


