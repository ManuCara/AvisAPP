package com.example.avis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Contact_us extends AppCompatActivity {

    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        drawerLayout = findViewById(R.id.drawer_layout);

    }

    public void Menu(View view){
        HomePage.OpenMenu(drawerLayout);
    }
    public void Profile(View view){
        HomePage.redirectActivity(this, Profile.class,false);
    }
    public void Contact_us(View view){
        HomePage.closeMenu(drawerLayout);
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
        HomePage.redirectActivity(this, where_we_are.class,false);
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
}