package com.example.canciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Activity2 extends AppCompatActivity
{

    ImageButton btn11, btn12, btn13, btn14, btn15;
    ImageView img1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        btn11 = findViewById(R.id.btn11);
        btn12 = findViewById(R.id.btn12);
        btn13 = findViewById(R.id.btn13);
        btn14 = findViewById(R.id.btn14);
        btn15 = findViewById(R.id.btn15);
        img1 = findViewById(R.id.img1);

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                LlamarAudio1();
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                LlamarAudio2();
            }
        });
        btn13.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                LlamarAudio3();
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                LlamarAudio4();
            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                LlamarAudio5();
            }
        });


    }
    private void LlamarAudio1()
    {
        Intent intent = new Intent(Activity2.this,JPop.class);
        startActivity(intent);
    }
    private void LlamarAudio2()
    {
        Intent intent = new Intent(Activity2.this,Metal.class);
        startActivity(intent);
    }
    private void LlamarAudio3()
    {
        Intent intent = new Intent(Activity2.this,Electronica.class);
        startActivity(intent);
    }
    private void LlamarAudio4()
    {
        Intent intent = new Intent(Activity2.this,Instrumental.class);
        startActivity(intent);
    }
    private void LlamarAudio5()
    {
        Intent intent = new Intent(Activity2.this,Gotic.class);
        startActivity(intent);
    }
}