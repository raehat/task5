package com.example.task5.StageThree;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.task5.R;

import java.util.ArrayList;

public class StageThree extends AppCompatActivity {

    ArrayList<StageThreeObject> arrayList;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage_three);

        getSupportActionBar().hide();

        arrayList= new ArrayList<>();
        recyclerView= findViewById(R.id.recycler_view_people);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrayList.add(new StageThreeObject(R.drawable.jack, "Jack Daniel",
                "Director, Cinematographer", "12.6k",
                "330", "1211"));

        arrayList.add(new StageThreeObject(R.drawable.john, "John Walker",
                "Photographer, Artist", "128.6k",
                "150", "90"));

        recyclerView.setAdapter(new RecyclerViewAdapterPeople(getApplicationContext(), arrayList));


    }
}