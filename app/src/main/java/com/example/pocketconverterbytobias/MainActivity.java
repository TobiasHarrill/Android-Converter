package com.example.pocketconverterbytobias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void goTemp(View v)
    {
        Intent i = new Intent(this, TempActivity.class);
        startActivity(i);

    }

    public void goDist(View v)
    {
        Intent i = new Intent(this, DistanceActivity.class);
        startActivity(i);

    }

    public void goWeigh(View v)
    {
        Intent i = new Intent(this, WeightActivity.class);
        startActivity(i);

    }
}