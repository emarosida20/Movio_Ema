package com.example.bioskoponline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Nonton extends AppCompatActivity {
    FloatingActionButton btnBackPrivateMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nonton);
        btnBackPrivateMovie = findViewById(R.id.btnBackPrivateMovie);
        btnBackPrivateMovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Nonton.this, PrivateMovie.class);
                startActivity(intent);
            }
        });
    }

}