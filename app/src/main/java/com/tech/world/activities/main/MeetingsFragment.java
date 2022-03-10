package com.tech.world.activities.main;

import android.app.ProgressDialog;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.tech.world.R;



import android.content.Intent;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MeetingsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MeetingsFragment extends Fragment {

    EditText code;
    TextView join, share,meet,text1;
    Animation fin,fout;
    Button logout, cancel;
    VideoView videoView;
    ProgressDialog pd;

    String video_url = "https://www.daddyandco.com.my/Daddy-Co-Bartender-Promo.mp4";

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MeetingsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MeetingFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MeetingsFragment newInstance(String param1, String param2) {
        MeetingsFragment fragment = new MeetingsFragment();
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
        View v = inflater.inflate(R.layout.fragment_meetings, container, false);

       text1=(TextView)v.findViewById(R.id.text1);
        fin = AnimationUtils.loadAnimation(getActivity(),R.anim.slide_down);
      text1.setAnimation(fin);

        join = (TextView) v.findViewById(R.id.smeet);
        fout = AnimationUtils.loadAnimation(getActivity(),R.anim.slide_up);
        join.setAnimation(fout);
//        ImageSlider imageSlider= v.findViewById(R.id.image_slider);
//        List<SlideModel> slideModels  = new ArrayList<>() ;// Create array of image list
//
//
//
//        slideModels.add(new SlideModel("https://picsum.photos/seed/picsum/200/300", "Amazing.", ScaleTypes.CENTER_CROP));
//        slideModels.add(new SlideModel("https://picsum.photos/seed/picsum/200/300", "Amazing.", ScaleTypes.CENTER_CROP));
//        slideModels.add(new SlideModel("https://picsum.photos/seed/picsum/200/300", "Amazing.", ScaleTypes.CENTER_CROP));
//        slideModels.add(new SlideModel("https://picsum.photos/seed/picsum/200/300", "Amazing.", ScaleTypes.CENTER_CROP));


        videoView = v.findViewById(R.id.videoView);
//        pd = new ProgressDialog(v.getContext());
//        pd.setMessage("Buffering...");
//        pd.show();
//
//        Uri uri = Uri.parse(video_url);
//        videoView.setVideoURI(uri);
//        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                pd.dismiss();
//                mp.setLooping(true);
//
//            }
//        });
//        MediaController mediaController = new MediaController(v.getContext());
//        mediaController.setAnchorView(videoView);
//        videoView.setMediaController(mediaController);

        Uri uri = Uri.parse("android.resource://" + getActivity().getPackageName() + "/" + R.raw.demo);
        videoView.setVideoURI(uri);
        videoView.start();

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });


//        imageSlider.startSliding(3000); // with new period
//        imageSlider.stopSliding();
//
//        imageSlider.setImageList(slideModels);


//       EditText code = (EditText)v.findViewById(R.id.codebox);

        join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MeetingActivity.class);
//                        getActivity().getPackageManager().getLaunchIntentForPackage("meeting.online.app");
                if (intent != null) {

                    startActivity(intent);
                } else {
                    Toast.makeText(getContext(), "NO package Found or Some Error Occurred Please Try Again.....", Toast.LENGTH_LONG).show();
                }
            }
        });


        return v;

    }

    @Override
    public void onResume() {
        videoView.resume();
        super.onResume();
    }


    @Override
    public void onPause() {
        videoView.suspend();
        super.onPause();
    }

    @Override
    public void onDestroy() {
        videoView.stopPlayback();
        super.onDestroy();
    }




}


