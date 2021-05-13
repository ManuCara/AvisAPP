package com.example.avis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NavBar extends AppCompatActivity {

    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        drawerLayout = findViewById(R.id.drawer_layout);
    }

    public void Menu(View  view){
        OpenMenu(drawerLayout);

    }

    public static void OpenMenu(DrawerLayout drawerLayout) {
        drawerLayout.openDrawer(GravityCompat.START);
    }

    public static void closeMenu(DrawerLayout drawerLayout){
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }

    public void Profilo(View view){
        redirectActivity(this,Profilo.class,false);
    }
    public void Contattaci(View view){
        redirectActivity(this,Profilo.class,false);
    }
    public void News(View view){
        redirectActivity(this,Profilo.class,false);
    }
    public void blood_weather(View view){
        redirectActivity(this,Profilo.class,false);
    }
    public void Vademecum(View view){
        redirectActivity(this,Profilo.class,false);
    }
    public void where_we_are(View view){
        redirectActivity(this,Profilo.class,false);
    }
    public void Settings(View view){
        redirectActivity(this,Profilo.class,false);
    }
    public void Logout(View view){
        redirectActivity(this,Profilo.class,false);
    }
    public void chi_siamo(View view){
        redirectActivity(this,Profilo.class,false);
    }
    public void Home(View view){
        redirectActivity(this, NavBar.class,false);
    }




    public static void redirectActivity(Activity activity, Class aclass,boolean chiudi) {
        Intent intent = new Intent(activity,aclass);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.startActivity(intent);
        activity.finish();
    }

    @Override
    protected void onPause(){
        super.onPause();
        closeMenu(drawerLayout);
    }



}