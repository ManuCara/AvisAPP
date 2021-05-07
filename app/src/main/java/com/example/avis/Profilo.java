package com.example.avis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Profilo extends AppCompatActivity {

    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilo);
        getSupportActionBar().hide();
        drawerLayout = findViewById(R.id.drawer_layout);
        
    }

    public void Menu(View view){
        NavBar.OpenMenu(drawerLayout);
    }
    public void Profile(View view){
        //recreate();
        NavBar.closeMenu(drawerLayout);
    }
    public void Contact_us(View view){
        NavBar.redirectActivity(this, NavBar.class,true);
    }
    public void News(View view){
        NavBar.redirectActivity(this, NavBar.class,true);
    }
    public void blood_weather(View view){
        NavBar.redirectActivity(this, NavBar.class,true);
    }
    public void Vademecum(View view){
        NavBar.redirectActivity(this, NavBar.class,true);
    }
    public void where_we_are(View view){
        NavBar.redirectActivity(this, NavBar.class,true);
    }
    public void Settings(View view){
        NavBar.redirectActivity(this, NavBar.class,true);
    }
    public void Logout(View view){
        NavBar.redirectActivity(this, NavBar.class,true);
    }
    public void chi_siamo(View view){
        NavBar.redirectActivity(this, NavBar.class,true);
    }
    public void Home(View view){
        NavBar.redirectActivity(this, NavBar.class,true);
    }

    @Override
    protected void onPause(){
        super.onPause();
        NavBar.closeMenu(drawerLayout);
    }
    @Override
    public void onBackPressed() {
        Intent setIntent = new Intent(this, NavBar.class);
        setIntent.addCategory(Intent.CATEGORY_HOME);
        setIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(setIntent);
    }


}