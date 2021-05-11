package com.example.avis;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
    }

    public void News(View view){
        redirectActivity(this,News.class);
    }
    public void blood_weather(View view){
        redirectActivity(this,weather.class);
    }
    public void Vademecum(View view){
        redirectActivity(this,vade.class);
    }

    private void redirectActivity(Activity activity, Class aClass) {
        startActivity(new Intent(activity, aClass));
    }

    @Override
    protected void onPause(){
        super.onPause();
    }
}