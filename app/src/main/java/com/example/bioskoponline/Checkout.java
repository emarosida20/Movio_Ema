package com.example.bioskoponline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Checkout extends AppCompatActivity {
    Button btnCheckoutNow;
    FloatingActionButton btnBackPilihPaket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        btnCheckoutNow = findViewById(R.id.btnCheckoutNow);
        btnCheckoutNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Checkout.this, HappyWatching.class);
                startActivity(intent);
            }
        });
        btnBackPilihPaket = findViewById(R.id.btnBackPilihPaket);
        btnBackPilihPaket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Checkout.this, PilihPaket.class);
                startActivity(intent);
            }
        });
    }
}