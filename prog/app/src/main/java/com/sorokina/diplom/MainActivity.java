package com.sorokina.diplom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button calor;
    private Button sport;
    private Button recipes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calor = (Button) findViewById(R.id.calories);
        calor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCalories();
            }
        });

        sport = (Button) findViewById(R.id.sport);
        sport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSport();
            }
        });

        recipes = (Button) findViewById(R.id.recipes);
        recipes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRecipes();
            }
        });
    }



    public void openCalories(){
        Intent intent_calor = new Intent(this, calories.class);
        startActivity(intent_calor);
    }

    public void openSport(){
        Intent intent_sport = new Intent(this, sport.class);
        startActivity(intent_sport);
    }

    public void openRecipes(){
        Intent intent_recipes = new Intent(this, recipes.class);
        startActivity(intent_recipes);
    }
}