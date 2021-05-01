package com.example.avis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class Profilo extends AppCompatActivity {

    DrawerLayout drawerLayout;
    final Activity activity = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilo);
        drawerLayout = findViewById(R.id.drawer_layout);
    }

    public void Menu(View view){
        MainActivity.OpenMenu(drawerLayout);
    }
    public void Profilo(View view){
        recreate();
    }
    public void Contattaci(View view){
        MainActivity.redirectActivity(this,MainActivity.class,true,activity);
    }
    public void News(View view){
        MainActivity.redirectActivity(this,MainActivity.class,true,activity);
    }
    public void Meteo_sangue(View view){
        MainActivity.redirectActivity(this,MainActivity.class,true,activity);
    }
    public void Vademecum(View view){
        MainActivity.redirectActivity(this,MainActivity.class,true,activity);
    }
    public void Dove_siamo(View view){
        MainActivity.redirectActivity(this,MainActivity.class,true,activity);
    }
    public void Impostazioni(View view){
        MainActivity.redirectActivity(this,MainActivity.class,true,activity);
    }
    public void Logout(View view){
        MainActivity.redirectActivity(this,MainActivity.class,true,activity);
    }
    public void chi_siamo(View view){
        MainActivity.redirectActivity(this,MainActivity.class,true,activity);
    }
    public void Home(View view){
        MainActivity.redirectActivity(this,MainActivity.class,true, activity);
    }


}