package com.example.bioskoponline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Genre extends AppCompatActivity {
    FloatingActionButton nextPilihPaket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre);

        nextPilihPaket = findViewById(R.id.nextPilihPaket);
        nextPilihPaket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Genre.this, PilihPaket.class);
                startActivity(intent);
            }
        });
    }
}