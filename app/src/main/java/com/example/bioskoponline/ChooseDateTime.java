package com.example.bioskoponline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ChooseDateTime extends AppCompatActivity {
    FloatingActionButton btnBackAddMovie, btnNextMoviesToday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_date_time);
        btnBackAddMovie = findViewById(R.id.btnBackAddMovie);
        btnNextMoviesToday = findViewById(R.id.btnNextMoviesToday);
        btnBackAddMovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChooseDateTime.this, AddMovie.class);
                startActivity(intent);
            }
        });
        btnNextMoviesToday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChooseDateTime.this, MoviesToday.class);
                startActivity(intent);
            }
        });
    }
}