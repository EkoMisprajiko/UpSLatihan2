package com.android.upslatihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.VideoView;

public class MultimediaActivity extends AppCompatActivity {

    VideoView videoObjek;
    MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multimedia);

        //inisialisasi
        videoObjek = (VideoView) findViewById(R.id.video_view);

        //fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        videoObjek.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video));

        mediaController = new android.widget.MediaController(this);
        mediaController.setAnchorView(videoObjek);
        videoObjek.setMediaController(mediaController);
        videoObjek.start();


    }
}
