package com.example.task5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.task5.StageOne.StageOne;
import com.example.task5.StageThree.StageThree;
import com.example.task5.StageTwo.StageTwo;

public class MainActivity extends AppCompatActivity {
    
    Button stage1, stage2, stage3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        stage1= findViewById(R.id.stage_1);
        stage2= findViewById(R.id.stage_2);
        stage3= findViewById(R.id.stage_3);

        stage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), StageOne.class));
            }
        });

        stage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), StageTwo.class));
            }
        });

        stage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), StageThree.class));
            }
        });
    }
}