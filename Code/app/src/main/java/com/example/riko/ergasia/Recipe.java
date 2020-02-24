package com.example.riko.ergasia;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Recipe extends AppCompatActivity {

    private Button buttonBack;
    private Button link;
    private Button start;
    private TextView info;
    private TextView temptime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        initializeVriable();

        Intent inta = getIntent();

        final String recipe = inta.getStringExtra("recipe");

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BackActivity();
            }
        });


        if (recipe.equals("chicken")) {
            String text = "GREEK LEMON ROAST CHICKEN AND POTATOES";
            String TEXT1 = "Preheat oven to 200* C (390* F) Fan" +
                    "               45 minutes.";
            info.setText(text);
            temptime.setText(TEXT1);
            link.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    urlact("https://akispetretzikis.com/en/categories/kotopoylo-galopoyla/kotopoylo-lemonato-me-patates");
                }
            });
            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    WorkingActivity("200", "100");
                }
            });

        }
        else if (recipe.equals("pizza")) {
            String text = "AUTHENTIC ITALIAN PIZZA" ;
            String TEXT1="Preheat oven to 230* C (440* F) Fan" +
                    "       7-10 minutes.";
            info.setText(text);
            temptime.setText(TEXT1);
            link.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    urlact("https://akispetretzikis.com/en/categories/snak-santoyits/aythentikh-italikh-pizza");
                }
            });
            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    WorkingActivity("230", "30");
                }
            });
        }
        else if (recipe.equals("cake")) {
            String text = "MARBLE CAKE";
            String TEXT1="Preheat oven to 160* C (320* F) Fan." +
                    "          35-40 minutes.";
            info.setText(text);
            temptime.setText(TEXT1);
            link.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    urlact("https://akispetretzikis.com/en/categories/keik/marble-cake");
                }
            });
            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    WorkingActivity("160", "50");
                }
            });
        }
        else if (recipe.equals("torte")) {
            String text = "CHEESY BAKED TORTELLINI";
            String TEXT1="Preheat the oven to 200ο C (390ο F) set to fan." +
                    "          10-15 minutes.";
            info.setText(text);
            temptime.setText(TEXT1);
            link.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    urlact("https://akispetretzikis.com/en/categories/zymarika/tortelinia-me-tyri-ston-foyrno");
                }
            });
            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    WorkingActivity("200", "25");
                }
            });
        }
        else if (recipe.equals("potatoes")) {
            String text = "CRUNCHY ROAST POTATOES";
            String TEXT1="Preheat oven to 200* C (390* F) Fan." +
                    "          30-40 minutes.";
            info.setText(text);
            temptime.setText(TEXT1);
            link.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    urlact("https://akispetretzikis.com/en/categories/ryzi-amp-patates/patates-pshtes-ston-foyrno");
                }
            });
            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    WorkingActivity("200", "50");
                }
            });
        }
        else if (recipe.equals("fish")) {
            String text = "BAKED SALMON WITH VEGETABLES";
            String TEXT1="Preheat the oven to 200ο C (390ο F) set to fan." +
                    "          20-25 minutes.";
            info.setText(text);
            temptime.setText(TEXT1);
            link.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    urlact("https://akispetretzikis.com/en/categories/thalassina-psaria/solomos-me-lachanika-ston-foyrno");
                }
            });
            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    WorkingActivity("200", "35");
                }
            });
        }
        else if (recipe.equals("vegetables")) {
            String text = "ROASTED VEGETABLE MEDLEY";
            String TEXT1="Preheat oven to 180* C (350* F) Fan." +
                    "          40-45 minutes.";
            info.setText(text);
            temptime.setText(TEXT1);
            link.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    urlact("https://akispetretzikis.com/en/categories/ladera/mpriam");
                }
            });
            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    WorkingActivity("180", "55");
                }
            });
        }
        else if (recipe.equals("pie")) {
            String text = "HAM AND CHEESE KOUROU DOUGH PIE";
            String TEXT1="Preheat oven to 170* C (338* F) Fan." +
                    "          40-50 minutes.";
            info.setText(text);
            temptime.setText(TEXT1);
            link.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    urlact("https://akispetretzikis.com/en/categories/almyres-pites-tartes/h-grhgorh-zamponotyropita");
                }
            });
            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    WorkingActivity("170", "60");
                }
            });
        }
    }

    public void  WorkingActivity(String message,String message_1){

        Intent intent = new Intent(this, Working.class);
        intent.putExtra("temperature",message);
        intent.putExtra("timer",message_1);
        startActivity(intent);
    }

    public void urlact(String url) {
        Intent intent= new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    public void  BackActivity(){
        Intent intent = new Intent(this, Suggested.class);
        startActivity(intent);
    }

    private void initializeVriable()
    {
        buttonBack= findViewById(R.id.backbut);
        info = findViewById(R.id.info);
        start = findViewById(R.id.start);
        link = findViewById(R.id.link);
        temptime = findViewById(R.id.temptime);


    }
}
