package com.example.task5.StageOne;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.task5.R;

import java.util.ArrayList;

public class StageOne extends AppCompatActivity {

    RecyclerView recyclerView_important, recyclerView_files, recyclerView_options;
    RecyclerViewAdapter recyclerViewAdapter;
    ArrayList<StageOneObject> arrayList1, arrayList2, arrayList3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage_one);

        getSupportActionBar().hide();
        arrayList1= new ArrayList<>();
        arrayList2= new ArrayList<>();
        arrayList3= new ArrayList<>();
        recyclerView_important= findViewById(R.id.recycler_view_important);
        recyclerView_files= findViewById(R.id.recycler_view_files);
        recyclerView_options= findViewById(R.id.recycler_view_options);

        arrayList1.add(new StageOneObject(R.drawable.degree,"Degree"));
        arrayList1.add(new StageOneObject(R.drawable.assignment,"Assignments"));
        arrayList1.add(new StageOneObject(R.drawable.photos,"Photos"));

        recyclerView_important.setLayoutManager(new LinearLayoutManager(this));
        recyclerView_important.setAdapter(new RecyclerViewAdapter(getApplicationContext(), arrayList1));

        arrayList2.add((new StageOneObject(R.drawable.png, "Png Images")));
        arrayList2.add((new StageOneObject(R.drawable.jpg, "Jpg Images")));
        arrayList2.add(new StageOneObject(R.drawable.doc, "Word Documents"));
        arrayList2.add(new StageOneObject(R.drawable.pdf, "PDF documents"));

        recyclerView_files.setLayoutManager(new LinearLayoutManager(this));
        recyclerView_files.setAdapter(new RecyclerViewAdapter(getApplicationContext(), arrayList2));

        arrayList3.add(new StageOneObject(R.drawable.settings, "Other Settings"));

        recyclerView_options.setLayoutManager(new LinearLayoutManager(this));
        recyclerView_options.setAdapter(new RecyclerViewAdapter(getApplicationContext(), arrayList3));

    }
}