package com.example.fourniture;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Main4Activity extends AppCompatActivity {

    LinearLayout personLinearLayout, homeLinearLayout;
    FloatingActionButton favorite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        getWindow().getDecorView().setSystemUiVisibility( View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);

        personLinearLayout = findViewById(R.id.person_linear_layout);
        homeLinearLayout = findViewById(R.id.home_linear_layout);
        favorite = findViewById(R.id.favorite);

        personLinearLayout.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Main3Activity.class);
            startActivity(intent);
        });

        homeLinearLayout.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
            startActivity(intent);
        });

        favorite.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Main4Activity.class);
            startActivity(intent);
        });
    }
}