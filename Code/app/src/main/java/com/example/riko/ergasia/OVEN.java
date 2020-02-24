package com.example.riko.ergasia;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OVEN extends AppCompatActivity {

    private Button buttonBack;
    private Button prwto;
    private Button deutero;
    private Button trito;
    private Button tetarto;
    private Button pempto;
    private Button ekto;
    private Button evdomo;
    private Button ogdoo;
    private Button enato;
    private Button suggested;
    private Button info;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oven);

        initializeVriable();
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BackActivity();
            }
        });
        prwto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thermalactivity();
            }
        });
        deutero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thermalactivity();
            }
        });
        trito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thermalactivity();
            }
        });
        tetarto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thermalactivity();
            }
        });
        pempto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thermalactivity();
            }
        });
        ekto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thermalactivity();
            }
        });
        evdomo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thermalactivity();
            }
        });
        ogdoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thermalactivity();
            }
        });
        enato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thermalactivity();
            }
        });
        suggested.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sugactivity();
            }
        });
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                urlact("https://www.which.co.uk/reviews/built-in-ovens/article/oven-symbols-and-controls-explained");
            }
        });
    }
    public void  BackActivity(){
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
    public void  thermalactivity(){
        Intent intent = new Intent(this, Temperature_2.class);
        startActivity(intent);
    }
    public void sugactivity(){
        Intent intent = new Intent(this, Suggested.class);
        startActivity(intent);
    }

    public void urlact(String url) {
        Intent intent= new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    private void initializeVriable()
    {
        buttonBack= findViewById(R.id.backbut);
        prwto= findViewById(R.id.prwto);
        deutero =  findViewById(R.id.deutero);
        trito= findViewById(R.id.trito);
        tetarto =  findViewById(R.id.tetarto);
        pempto= findViewById(R.id.pempto);
        ekto =  findViewById(R.id.ekto);
        evdomo= findViewById(R.id.evdomo);
        ogdoo =  findViewById(R.id.ogdoo);
        enato =  findViewById(R.id.enato);
        suggested = findViewById(R.id.sugg);
        info = findViewById(R.id.info);

    }
}
