package com.s3.movieflex;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerViewAdapter adapter;
    ArrayList<model> film = new ArrayList<>();
    RecyclerView recyclerview1,recyclerview2,recyclerview3,recyclerview4,recyclerview5;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        adapter = new RecyclerViewAdapter(this, film);
        recyclerview1 = findViewById(R.id.upcoming_view);

        recyclerview1.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        recyclerview1.setAdapter(adapter);
        film.add(new model("Blade Runner 2049", R.drawable.first));
        film.add(new model("Thor Ragnarok", R.drawable.second));
        film.add(new model("The Expendables", R.drawable.third));
        film.add(new model("Black Widow", R.drawable.fourth));
        film.add(new model("The Hunger Games Mockingjay", R.drawable.fifth));
        film.add(new model("Dolittle", R.drawable.seven));
        film.add(new model("Alpha", R.drawable.eight));
        ///11111
        recyclerview2 = findViewById(R.id.cat1);
        recyclerview2.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        recyclerview2.setAdapter(adapter);
        /////22222
        recyclerview3 = findViewById(R.id.cat2);
        recyclerview3.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        recyclerview3.setAdapter(adapter);
        //3333333
        recyclerview4 = findViewById(R.id.cat3);
        recyclerview4.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        recyclerview4.setAdapter(adapter);
        //444444444
        recyclerview5 = findViewById(R.id.cat4);
        recyclerview5.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        recyclerview5.setAdapter(adapter);


    }
}