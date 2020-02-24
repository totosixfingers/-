package com.example.riko.ergasia;

import android.content.Intent;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class Working extends AppCompatActivity  {

    private Button END;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_working);

        final String[] temper = {"0" , "10", "20", "30", "40", "50", "60","70","80","90","100","110","120","130","140","150","160","170","180","190","200","210","220","230","240","250","260","270","280"};
        final String[] time =  {"0", "5" , "10","15","20","25","30","35","40","45","50","55","60","65","70","75","80","85","90","95","100","105","110","115","120","125","130","135","140","145","150"};


        Intent inta = getIntent();

        final String temperature = inta.getStringExtra("temperature");
        final TextView text1= findViewById(R.id.temperature);


        final String timer = inta.getStringExtra("timer");
        final  int newtimer=Integer.parseInt(timer);
        final TextView text2= findViewById(R.id.time);

        if (timer.equals("0")) {
            new CountDownTimer(500000000, 2000) {


                int time_i=-5;

                public void onTick(long millisUntilFinished) {
                    text1.setText(temperature);


                    time_i= time_i+5;

                    text2.setText(String.valueOf(time_i));

                }

                public void onFinish() {

                }

            }.start();
        }
        else {

            new CountDownTimer(500000000, 2000) {
                int nt;
                int k=0;
                int temperrr=0;
                int temper_i = 0;
                int time_i=timer.length();
               // int lol=Integer.parseInt(temperature);


                public void onTick(long millisUntilFinished) {
                    text1.setText(temperature);

                   /* String sttemp =String.valueOf(temperrr);


                    System.out.print("=============================================="+temperrr);*/
                  //  if (!sttemp.equals(temperature)){


                   // }

              //  if(temperrr<lol){temperrr=temperrr+10; }

                 /*  if(!temper[temper_i].equals(temperature)) {

                          //  System.out.println(temper[temper_i].equals(temperature));
                         //   text1.setText(temper[temper_i]);
                            temper_i++;

                    }
                    time_i=time_i-1;
                    /*if(!Long.toString(time_i).equals(timer)){
                        int a= Integer.parseInt(timer);
                        a=a-time_i;





                    }*/
                    text2.setText(String.valueOf(newtimer-k));
                    k=k+5;
                    nt =newtimer-k;


                    if(nt==0){
                        finish();
                    }

                }

                public void onFinish() {


                }
            }.start();
        }





        END = findViewById(R.id.end);

        END.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                BackActivity();
            }
        });
    }

    public void  BackActivity(){

        TextView ab = findViewById(R.id.temperature);

        String message = ab.getText().toString();


        Intent intent = new Intent(this, Menu.class);
        intent.putExtra("temperature",message);
        startActivity(intent);
    }
}
