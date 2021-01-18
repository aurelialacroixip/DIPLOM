package com.sorokina.diplom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button calor;


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
    }

    public void openCalories(){
        Intent intent_calor = new Intent(this, calories.class);
        startActivity(intent_calor);
    }

}