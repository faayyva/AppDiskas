package com.example.diskas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Adapter adapter;
    ArrayList<String> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items= new ArrayList<>();
        items.add("Kelas Pemula UI/UX Design");
        items.add("Kelas UI/UX Design Mastery");
        items.add("Belajar Dasar UX Design");
        items.add("Merancang UI/UX Design Android");
        items.add("Merancang UI/UX Design Android");
        recyclerView = findViewById(R.id.recycelrviewkelasui);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter= new Adapter(this, items);
        recyclerView.setAdapter(adapter);

    }
}