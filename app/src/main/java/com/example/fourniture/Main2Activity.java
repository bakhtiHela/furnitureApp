package com.example.fourniture;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;


import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Main2Activity extends AppCompatActivity {

    LinearLayout personLinearLayout,plantsLinearLayout,lampsLinearLayout,chairsLinearLayout;
    FloatingActionButton favorite;
    CardView cactusCardView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        personLinearLayout = findViewById(R.id.person_linear_layout);
        favorite = findViewById(R.id.favorite);
        cactusCardView = findViewById(R.id.cactus_card_view);
        plantsLinearLayout= findViewById(R.id.plants);
        lampsLinearLayout= findViewById(R.id.lamps);
        chairsLinearLayout= findViewById(R.id.chairs);

        chairsLinearLayout.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), ChairActivity.class);
            startActivity(intent);
        });

        lampsLinearLayout.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), LampActivity.class);
            startActivity(intent);
        });

        plantsLinearLayout.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), PlantActivity.class);
            startActivity(intent);
        });

        personLinearLayout.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Main3Activity.class);
            startActivity(intent);
        });
        favorite.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Main4Activity.class);
            startActivity(intent);
        });
        cactusCardView.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Main5Activity.class);
            startActivity(intent);

        });
    }

    public void CartBtn(View view) {
        Intent intent = new Intent(getApplicationContext(), CartActivity.class);
        startActivity(intent);

    }
}