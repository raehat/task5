package com.example.task5.StageTwo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.task5.R;

import java.util.ArrayList;

public class StageTwo extends AppCompatActivity {

    RecyclerViewAdapterPets recyclerViewAdapterPets;
    RecyclerView recyclerView;
    ArrayList<StageTwoObject> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage_two);

        getSupportActionBar().hide();

        recyclerView= findViewById(R.id.recycler_view_pets);
        arrayList= new ArrayList<>();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrayList.add(new StageTwoObject( "Cats", R.drawable.cat2_task5));
        arrayList.add(new StageTwoObject("Dogs", R.drawable.dogs));
        arrayList.add(new StageTwoObject("Hamsters", R.drawable.hamster));
        arrayList.add(new StageTwoObject("Parrots", R.drawable.parrot));
        arrayList.add(new StageTwoObject("Gold Fish", R.drawable.gold_fish));

        recyclerView.setAdapter(new RecyclerViewAdapterPets(getApplicationContext(),arrayList));
    }
}