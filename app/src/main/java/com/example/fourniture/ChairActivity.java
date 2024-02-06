package com.example.fourniture;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

public class ChairActivity extends AppCompatActivity {
    LinearLayout personLinearLayout;
    LinearLayout homeLinearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chair);

        homeLinearLayout = findViewById(R.id.home_linear_layout);
        personLinearLayout = findViewById(R.id.person_linear_layout);

        homeLinearLayout.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
            startActivity(intent);
        });

        personLinearLayout.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Main3Activity.class);
            startActivity(intent);
        });
    }
}