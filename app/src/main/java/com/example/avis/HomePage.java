package com.example.avis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomePage extends AppCompatActivity {


    Button btn_news;
    Button btn_meteo;
    Button btn_vademecum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        btn_news = findViewById(R.id.News);
        btn_meteo = findViewById(R.id.Meteo_sangue);
        btn_vademecum = findViewById(R.id.Vademecum);

        btn_news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), HomePage.class));
                Toast.makeText(getApplicationContext(),"activity news",Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        btn_meteo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), HomePage.class));
                Toast.makeText(getApplicationContext(),"activity meteo del sangue",Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        btn_vademecum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), HomePage.class));
                Toast.makeText(getApplicationContext(),"activity vademecum",Toast.LENGTH_SHORT).show();
                finish();
            }
        });


    }
}