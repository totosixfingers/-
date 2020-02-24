package com.example.riko.ergasia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class Temperature_2 extends AppCompatActivity {

    private Button buttonBack;
    private TextView text1;
    private TextView text2;
    private Button Start;
    private SeekBar seekBar;
    private Button plus2;
    private Button minus2;
    private int duo_i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_2);
        initializeVriable();

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BackActivity();
            }
        });

        final String[] timer =  {"0", "5" , "10","15","20","25","30","35","40","45","50","55","60","65","70","75","80","85","90","95","100","105","110","115","120","125","130","135","140","145","150"};

        text1 = findViewById(R.id.tmep);
        text2 = findViewById(R.id.text2);

        seekBar.setMax(30);
        seekBar.setProgress(0);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int temp=0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                temp = progress;
                text1.setText(" " +temp*10);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        plus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (duo_i<30) {
                    duo_i++;
                    text2.setText(timer[duo_i]);
                }

            }
        });
        minus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (duo_i>0) {
                    duo_i--;
                    text2.setText(timer[duo_i]);
                }

            }
        });
        Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!text1.getText().toString().equals("0")){
                    WorkingActivity();
                }

            }
        });
    }

    public void  BackActivity(){
        Intent intent = new Intent(this, OVEN.class);
        startActivity(intent);
    }

    public void  WorkingActivity(){

        text1 = findViewById(R.id.tmep);
        text2 = findViewById(R.id.text2);




        String message = text1.getText().toString();
        String message_1 = text2.getText().toString();

        Intent intent = new Intent(this, Working.class);
        intent.putExtra("temperature",message);
        intent.putExtra("timer",message_1);
        startActivity(intent);
    }
    private void initializeVriable() {
        buttonBack = findViewById(R.id.backbut);
        Start = findViewById(R.id.start);
        plus2 = findViewById(R.id.plus2);
        minus2 = findViewById(R.id.minus2);
        seekBar = findViewById(R.id.seek);
    }
}
