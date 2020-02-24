package com.example.riko.ergasia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HOBS extends AppCompatActivity {

    private Button buttonBack;
    private Button plus1;
    private Button plus2;
    private Button plus3;
    private Button plus4;
    private Button minus1;
    private Button minus2;
    private Button minus3;
    private Button minus4;
    private int ena_i;
    private int duo_i;
    private int tria_i;
    private int tessera_i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hobs);
        initializeVriable();
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BackActivity();
            }
        });

        final String[] textbutton1_3 = {"0" , "1" , "2" , "3", "4", "5", "6", "7", "8", "9", "10", "11", "12",};
        final String[] textbutton2_4 = {"0" , "1" , "2" , "3"};

        final TextView text1 = findViewById(R.id.tmep);
        final TextView text2 = findViewById(R.id.text2);
        final TextView text3 = findViewById(R.id.text3);
        final TextView text4 = findViewById(R.id.text4);

        plus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ena_i<12) {
                    ena_i++;
                    text1.setText(textbutton1_3[ena_i]);
                }

            }
        });
        minus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ena_i>0) {
                    ena_i--;
                    text1.setText(textbutton1_3[ena_i]);
                }

            }
        });
        plus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (duo_i<3) {
                    duo_i++;
                    text2.setText(textbutton2_4[duo_i]);
                }

            }
        });
        minus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (duo_i>0) {
                    duo_i--;
                    text2.setText(textbutton2_4[duo_i]);
                }

            }
        });
        plus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tria_i<12) {
                    tria_i++;
                    text3.setText(textbutton1_3[tria_i]);
                }

            }
        });
        minus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tria_i>0) {
                    tria_i--;
                    text3.setText(textbutton1_3[tria_i]);
                }

            }
        });
        plus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tessera_i<3) {
                    tessera_i++;
                    text4.setText(textbutton2_4[tessera_i]);
                }

            }
        });
        minus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tessera_i>0) {
                    tessera_i--;
                    text4.setText(textbutton2_4[tessera_i]);
                }

            }
        });

    }
    public void  BackActivity(){
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
    private void initializeVriable()
    {
        buttonBack= findViewById(R.id.backbut);
        plus1= findViewById(R.id.plus1);
        minus1 =  findViewById(R.id.minus1);
        plus2= findViewById(R.id.plus2);
        minus2 =  findViewById(R.id.minus2);
        plus3= findViewById(R.id.plus3);
        minus3 =  findViewById(R.id.minus3);
        plus4= findViewById(R.id.plus4);
        minus4 =  findViewById(R.id.minus4);

    }
}
