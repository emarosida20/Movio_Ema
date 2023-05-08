package com.example.bioskoponline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class PilihPaket extends AppCompatActivity {
    FloatingActionButton btnBackGenre;
    Button btnLangganan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_paket);

        btnBackGenre = findViewById(R.id.btnBackGenre);
        btnBackGenre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PilihPaket.this, Genre.class);
                startActivity(intent);
            }
        });
        btnLangganan = findViewById(R.id.btnLangganan);
        btnLangganan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PilihPaket.this, Checkout.class);
                startActivity(intent);
            }
        });
    }
}