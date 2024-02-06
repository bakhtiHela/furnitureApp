package com.example.fourniture;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {
    ImageView backBtn;
    Button addToCart;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);

        backBtn = findViewById(R.id.back);
        addToCart = findViewById(R.id.add_to_cart);

        backBtn.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
            startActivity(intent);
        });

        addToCart.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), CartActivity.class);
            startActivity(intent);
        });



    }
}
