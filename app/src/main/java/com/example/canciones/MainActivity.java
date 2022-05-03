package com.example.canciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    Button audio,audio2,audio3;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        audio=findViewById(R.id.audio);
        audio2=findViewById(R.id.audio2);
        audio3=findViewById(R.id.audio3);

        audio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this,R.raw.neko);
                mp.start();
                LlamarAudio();
            }
        });
        audio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this,R.raw.neko);
                mp.start();
                LlamarAudio2();
            }
        });
        audio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                MediaPlayer mp = MediaPlayer.create(MainActivity.this,R.raw.neko);
                mp.start();
                LlamarAudio3();
            }
        });
    }
    private void LlamarAudio()
    {
        Intent intent = new Intent(MainActivity.this,botones.class);
        startActivity(intent);
    }
    private void LlamarAudio2()
    {
        Intent intent = new Intent(MainActivity.this,Activity2.class);
        startActivity(intent);
    }
    private void LlamarAudio3()
    {
        Intent intent = new Intent(MainActivity.this,Activity3.class);
        startActivity(intent);
    }
}