package com.example.diskas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    RecyclerView recyclerView;

    Adapter2 adapter2 ;

    ArrayList<String> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        items = new ArrayList<>();
        items.add("Bimbingan Kuliah di Luar Negeri dan Tips & Trik");
        items.add("Tips & Trik Beasiswa Bank Indonesia 2024");
        items.add("Kunci Sukses IELTS up 500");
        items.add("Kunci Sukses Masuk GKS 2024");
        items.add("Bimbingan Kuliah di Luar Negeri dan Tips & Trik");

        recyclerView = findViewById(R.id.recycelrviewkelasbea);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter2 = new Adapter2(this, items);
        recyclerView.setAdapter(adapter2);
    }
}