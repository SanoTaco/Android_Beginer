package com.example.happybirthday;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //显示布局
        setContentView(R.layout.activity_main);
        //initialize
        initUI();
    }

    private void initUI() {
        //Get Media file
        final MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.cheers);
        //create click event
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            if(mediaPlayer.isPlaying()){
                mediaPlayer.pause();
            }else{
                mediaPlayer.start();
            }
            }
        });
    }
}