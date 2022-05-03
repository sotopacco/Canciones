package com.example.canciones;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Metal extends AppCompatActivity {

    ImageView btn31,btn32,btn33,btn34,btn35;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metal);
        btn31 = findViewById(R.id.btn21);
        btn32 = findViewById(R.id.btn22);
        btn33 = findViewById(R.id.btn23);
        btn34 = findViewById(R.id.btn24);
        btn35 = findViewById(R.id.btn25);

        btn31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                MediaPlayer mp = MediaPlayer.create(Metal.this,R.raw.mmaximum);
                mp.start();
            }
        });

        btn32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Metal.this,R.raw.msystem);
                mp.start();
            }
        });
        btn33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                MediaPlayer mp = MediaPlayer.create(Metal.this,R.raw.mpapa);
                mp.start();
            }
        });
        btn34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Metal.this,R.raw.mrammstein);
                mp.start();
            }
        });
        btn35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Metal.this,R.raw.mbabymetal);
                mp.start();
            }
        });
    }

}