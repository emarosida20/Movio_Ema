package com.example.bioskoponline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MoviesToday extends AppCompatActivity {
    FloatingActionButton btnBackChooseDateTime;
    ImageView imgWatchSpiderman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies_today);
        btnBackChooseDateTime = findViewById(R.id.btnBackChooseDateTime);
        btnBackChooseDateTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MoviesToday.this, ChooseDateTime.class);
                startActivity(intent);
            }
        });
        imgWatchSpiderman = findViewById(R.id.imgWatchSpiderman);
        imgWatchSpiderman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MoviesToday.this, PrivateMovie.class);
                startActivity(intent);
            }
        });
    }
}