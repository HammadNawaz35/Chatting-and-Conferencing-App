package com.tech.world.activities.main;



import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.tech.world.R;
import com.tech.world.utils.NetworkHelper;

import org.jitsi.meet.sdk.JitsiMeet;
import org.jitsi.meet.sdk.JitsiMeetActivity;
import org.jitsi.meet.sdk.JitsiMeetConferenceOptions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;

public class MeetingHistoryActivity extends AppCompatActivity {
    TextView id,name,time,smeeting;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meeting_history);
        Tools.setSystemBarLight(this);
        Tools.setSystemBarColor(this, R.color.colorPrimaryDark);
       id =findViewById(R.id.meetingid);
      name=findViewById(R.id.meetingname);
     smeeting=findViewById(R.id.startmeeting);
       time=findViewById(R.id.meetingtime);
       toolbar=findViewById(R.id.tbar);
       setSupportActionBar(toolbar);
//        Date dateCurrent = Calendar.getInstance().getTime();
//        time.setText(dateCurrent.toString());
//       Bundle bundle=getIntent().getExtras();

//        Intent intent=getIntent();
//           String str1 =intent.getStringExtra("title");
//            String str2 =intent.getStringExtra("id");
//         String str3 =intent.getStringExtra("time");

        SharedPreferences sharedPreferences = getSharedPreferences("myKey", MODE_PRIVATE);
        String str1 = sharedPreferences.getString("title","");
        String str2 = sharedPreferences.getString("id","");
     String str3 = sharedPreferences.getString("time","");
            //set reciving value in textview
            id.setText(str2);
           name.setText(str1);
     time.setText(str3);




        smeeting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!NetworkHelper.isConnected(getApplicationContext())) {
                    Toast.makeText(MeetingHistoryActivity.this, "No Internet Connection.Make sure that u have Internet Connection.!!", Toast.LENGTH_LONG).show();
//            Snackbar.make(v.findViewById(android.R.id.content), R.string.no_internet_connection, Snackbar.LENGTH_SHORT).show();

                } else {

                    URL url;
                    try {
                        url = new URL("https://meet.jit.si");
                        JitsiMeetConferenceOptions defaultoptions = new JitsiMeetConferenceOptions.Builder()
                                .setServerURL(url).setWelcomePageEnabled(false).setVideoMuted(false).setFeatureFlag("invite.enabled", false)
                                .setFeatureFlag("meeting-name.enabled", true).setFeatureFlag("meeting-password.enabled", true)
                                .setFeatureFlag("video-mute.enabled", true).setFeatureFlag("welcomepage.enabled", false)
                                .setFeatureFlag("invite.enabled",false).setFeatureFlag("add-people.enabled",false)
                                .build();
                        JitsiMeet.setDefaultConferenceOptions(defaultoptions);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }

                    JitsiMeetConferenceOptions options = new JitsiMeetConferenceOptions.Builder().setRoom(id.getText().toString()).setWelcomePageEnabled(false).build();
                    JitsiMeetActivity.launch(MeetingHistoryActivity.this, options);

                }
            }
        });



    }
}
