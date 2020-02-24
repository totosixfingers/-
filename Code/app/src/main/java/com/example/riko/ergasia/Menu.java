package com.example.riko.ergasia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Menu extends AppCompatActivity {

    private Button button_oven;
    private Button button_hobs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

       button_oven =  findViewById(R.id.OVENbutton);
       button_oven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOvenActivity();
            }
        });
        button_hobs =  findViewById(R.id.HOBSbutton);
        button_hobs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHOBSActivity();
            }
        });

        final TextView text1= findViewById(R.id.tmep);
        Intent inta = getIntent();


        String temperature = inta.getStringExtra("temperature");

        text1.setText(temperature);



    }

    public void openOvenActivity(){
        Intent intent = new Intent(this, OVEN.class);
        startActivity(intent);
    }

    public void openHOBSActivity(){
        Intent intent = new Intent(this, HOBS.class);
        startActivity(intent);
    }

}
