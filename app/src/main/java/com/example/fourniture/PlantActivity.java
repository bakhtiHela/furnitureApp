package com.example.fourniture;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

public class PlantActivity extends AppCompatActivity {
    LinearLayout personLinearLayout;
    LinearLayout homeLinearLayout;
    CardView cactusCard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant);

        homeLinearLayout = findViewById(R.id.home_linear_layout);
        personLinearLayout = findViewById(R.id.person_linear_layout);
        cactusCard = findViewById(R.id.cactus);

        homeLinearLayout.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
            startActivity(intent);
        });
        cactusCard.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Main5Activity.class);
            startActivity(intent);

        });

        personLinearLayout.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Main3Activity.class);
            startActivity(intent);
        });
    }
}