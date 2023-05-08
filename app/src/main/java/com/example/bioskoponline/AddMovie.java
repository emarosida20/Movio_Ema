package com.example.bioskoponline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AddMovie extends AppCompatActivity {
    FloatingActionButton btnBackMainActivity;
    Button btnAddMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_movie);
        btnBackMainActivity = findViewById(R.id.btnBackMainActivity);
        btnBackMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddMovie.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btnAddMovie = findViewById(R.id.btnAddMovie);
        btnAddMovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddMovie.this, ChooseDateTime.class);
                startActivity(intent);
            }
        });
    }
}