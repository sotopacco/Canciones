package com.example.canciones;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Gotic extends AppCompatActivity {

    ImageView btn61,btn62,btn63,btn64,btn65;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gotic);

        btn61 = findViewById(R.id.btn11);
        btn62 = findViewById(R.id.btn12);
        btn63 = findViewById(R.id.btn13);
        btn64 = findViewById(R.id.btn14);
        btn65 = findViewById(R.id.btn15);

        btn61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                MediaPlayer mp = MediaPlayer.create(Gotic.this,R.raw.gfearwithintemptation);
                mp.start();
            }
        });

        btn62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Gotic.this,R.raw.glacunacoildaylightdancer);
                mp.start();
            }
        });

        btn63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                MediaPlayer mp = MediaPlayer.create(Gotic.this,R.raw.gleaveseyes);
                mp.start();
            }
        });

        btn64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Gotic.this,R.raw.gthecurelullaby);
                mp.start();
            }
        });

        btn65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Gotic.this,R.raw.gtreesofeternityblackocean);
                mp.start();
            }
        });
    }
}