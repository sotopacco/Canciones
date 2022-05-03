package com.example.canciones;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Electronica extends AppCompatActivity
 {
    ImageView btn41,btn42,btn43,btn44,btn45;
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronica);

        btn41 = findViewById(R.id.btn11);
        btn42 = findViewById(R.id.btn12);
        btn43 = findViewById(R.id.btn13);
        btn44 = findViewById(R.id.btn14);
        btn45 = findViewById(R.id.btn15);

        btn41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                MediaPlayer mp = MediaPlayer.create(Electronica.this,R.raw.imost);
                mp.start();
            }
        });

        btn42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Electronica.this,R.raw.ivogel);
                mp.start();
            }
        });

        btn43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                MediaPlayer mp = MediaPlayer.create(Electronica.this,R.raw.iandre);
                mp.start();
            }
        });

        btn44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Electronica.this,R.raw.itwo);
                mp.start();
            }
        });

        btn45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Electronica.this,R.raw.isword);
                mp.start();
            }
        });

    }
}