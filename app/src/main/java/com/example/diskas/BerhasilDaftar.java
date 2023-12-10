package com.example.diskas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class BerhasilDaftar extends AppCompatActivity {
    Button buttonMulai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berhasil_daftar);

        buttonMulai = findViewById(R.id.buttonMulai);

        // Di sini Anda dapat menambahkan logika untuk tombol "Daftar", misalnya:
        buttonMulai.setOnClickListener(view -> masuk());
    }
    private void masuk() {

        Intent intent = new Intent(BerhasilDaftar.this, DataUniversitasActivity.class);
        startActivity(intent) ;
    }
}