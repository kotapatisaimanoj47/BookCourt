package com.example.bookcourt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Sportselect extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sportselect);
        ArrayList<Getsport>getsports=new ArrayList<>();
        getsports.add(new Getsport(R.drawable.cricket,"Cricket"));
        getsports.add(new Getsport(R.drawable.badminton,"Badminton"));
        getsports.add(new Getsport(R.drawable.football,"Football"));


        recyclerView=findViewById(R.id.recyclerSport);
        layoutManager=new LinearLayoutManager(this);
        adapter=new SportSelectAdapter(getsports);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }
}
