package com.example.bioskoponline;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrivateMovie extends AppCompatActivity {
    Button backMoviesToday;
    CardView cdPrivateMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_private_movie);

        backMoviesToday = findViewById(R.id.btnBackMoviesToday);
        backMoviesToday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PrivateMovie.this, MoviesToday.class);
                startActivity(intent);
            }
        });
        cdPrivateMovie = findViewById(R.id.cdPrivateMovie);
        cdPrivateMovie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PrivateMovie.this, Nonton.class);
                startActivity(intent);
            }
        });
    }

}