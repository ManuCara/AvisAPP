package com.example.avis;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import java.net.URLEncoder;

public class where_we_are extends AppCompatActivity {

    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_where_we_are);
        drawerLayout = findViewById(R.id.drawer_layout);


    }

    public void Menu(View view){
        HomePage.OpenMenu(drawerLayout);
    }
    public void Profile(View view){
        HomePage.redirectActivity(this, Profile.class,false);
    }
    public void Contact_us(View view){
        HomePage.redirectActivity(this, Contact_us.class,false);
    }
    public void News(View view){
        HomePage.redirectActivity(this, Logout.class,false);
    }
    public void blood_weather(View view){
        HomePage.redirectActivity(this, blood_weather.class,false);
    }
    public void Vademecum(View view){
        HomePage.redirectActivity(this, Vademecum.class,false);
    }
    public void where_we_are(View view){
        HomePage.closeMenu(drawerLayout);
    }
    public void chi_siamo(View view){
        HomePage.redirectActivity(this, chi_siamo.class,false);
    }
    public void Settings(View view){
        HomePage.redirectActivity(this, Settings.class,false);
    }
    public void Logout(View view){
        HomePage.redirectActivity(this, Logout.class,false);
    }
    public void Home(View view){
        HomePage.redirectActivity(this, HomePage.class,true);
    }
    @Override
    protected void onPause(){
        super.onPause();
        HomePage.closeMenu(drawerLayout);
    }
    @Override
    public void onBackPressed() {
        Intent setIntent = new Intent(this, HomePage.class);
        setIntent.addCategory(Intent.CATEGORY_HOME);
        setIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(setIntent);
        finish();
    }


    public void entrambi(View v){
        Uri uri = Uri.parse("https://www.google.com/maps/search/avis+perugia+organizzazione/@43.0928964,12.3436733,14z");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void primo(View v){
        Uri uri = Uri.parse("https://www.google.com/maps/search/avis+perugia+organizzazione/@43.0928964,12.3436733,14z");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void secondo(View v){
        Uri uri = Uri.parse("https://www.google.com/maps/search/avis+perugia+organizzazione/@43.0928964,12.3436733,14z");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}