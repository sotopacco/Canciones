package com.example.canciones;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Instrumental extends AppCompatActivity {

    ImageView btn51,btn52,btn53,btn54,btn55;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instrumental);

        btn51 = findViewById(R.id.btn11);
        btn52 = findViewById(R.id.btn12);
        btn53 = findViewById(R.id.btn13);
        btn54 = findViewById(R.id.btn14);
        btn55 = findViewById(R.id.btn15);

        btn51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                MediaPlayer mp = MediaPlayer.create(Instrumental.this,R.raw.isword);
                mp.start();
            }
        });

        btn52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Instrumental.this,R.raw.itwo);
                mp.start();
            }
        });

        btn53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                MediaPlayer mp = MediaPlayer.create(Instrumental.this,R.raw.iandre);
                mp.start();
            }
        });

        btn54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Instrumental.this,R.raw.imost);
                mp.start();
            }
        });

        btn55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Instrumental.this,R.raw.ivogel);
                mp.start();
            }
        });
    }
}