package com.example.riko.ergasia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Suggested extends AppCompatActivity {


    private Button buttonBack;
    private Button chicken;
    private Button pizza;
    private Button vegetables;
    private Button torte;
    private Button potatoes;
    private Button fish;
    private Button pie;
    private Button cake;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggested);
        initializeVriable();
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BackActivity();
            }
        });
        chicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thermalactivity("chicken");
            }
        });
        pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thermalactivity("pizza");
            }
        });
        vegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thermalactivity("vegetables");
            }
        });
        torte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thermalactivity("torte");
            }
        });
        potatoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thermalactivity("potatoes");
            }
        });
        fish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thermalactivity("fish");
            }
        });
        pie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thermalactivity("pie");
            }
        });
        cake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thermalactivity("cake");
            }
        });
    }

    public void  BackActivity(){
        Intent intent = new Intent(this, OVEN.class);
        startActivity(intent);
    }

    public void  thermalactivity(String yeah){
        Intent intent = new Intent(this,Recipe.class);
        intent.putExtra("recipe",yeah);
        startActivity(intent);
    }

    private void initializeVriable()
    {
        buttonBack= findViewById(R.id.backbut);
        chicken= findViewById(R.id.chicken);
        torte =  findViewById(R.id.torte);
        pizza= findViewById(R.id.pizza);
        vegetables =  findViewById(R.id.vegetables);
        potatoes= findViewById(R.id.potatoes);
        fish =  findViewById(R.id.fish);
        pie= findViewById(R.id.ravioli);
        cake =  findViewById(R.id.cake);

    }
}
