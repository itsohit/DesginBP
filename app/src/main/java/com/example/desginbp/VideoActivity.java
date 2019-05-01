package com.example.desginbp;

import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {

    AlertDialog alert;
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        videoView = (VideoView) findViewById(R.id.video_view);
        String uriPath = "android.resource://"+getPackageName()+"/"+R.raw.sample;
        Uri uri = Uri.parse(uriPath);
        videoView.setVideoURI(uri);
        videoView.start();

    }

    public void alertVideo(View view){
        View v = LayoutInflater.from(this).inflate(R.layout.video_alert_dailog_layout,null);

        Button ok = (Button) v.findViewById(R.id.video_alert_ok);
        Button cancel = (Button) v.findViewById(R.id.video_alert_cancel);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alert.dismiss();
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alert.dismiss();
            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(v);
        alert = builder.create();
        alert.show();
    }

}
