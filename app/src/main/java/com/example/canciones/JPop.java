package com.example.canciones;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class JPop extends AppCompatActivity {
    ImageView btn21,btn22,btn23,btn24,btn25;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jpop);

        btn21 = findViewById(R.id.btn21);
        btn22 = findViewById(R.id.btn22);
        btn23 = findViewById(R.id.btn23);
        btn24 = findViewById(R.id.btn24);
        btn25 = findViewById(R.id.btn25);

        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                MediaPlayer mp = MediaPlayer.create(JPop.this,R.raw.jsword);
                mp.start();
            }
        });

        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(JPop.this,R.raw.jnaruto);
                mp.start();
            }
        });
        btn23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                MediaPlayer mp = MediaPlayer.create(JPop.this,R.raw.jevangelion);
                mp.start();
            }
        });
        btn24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(JPop.this,R.raw.jfullmetal);
                mp.start();
            }
        });
        btn25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(JPop.this,R.raw.jmirai);
                mp.start();
            }
        });
    }
}