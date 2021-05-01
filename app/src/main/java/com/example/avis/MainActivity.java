package com.example.avis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    final Activity activity = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        redirectActivity(this,Profilo.class,false,activity);
    }
    public void Contattaci(View view){
        redirectActivity(this,Profilo.class,false,activity);
    }
    public void News(View view){
        redirectActivity(this,Profilo.class,false,activity);
    }
    public void Meteo_sangue(View view){
        redirectActivity(this,Profilo.class,false,activity);
    }
    public void Vademecum(View view){
        redirectActivity(this,Profilo.class,false,activity);
    }
    public void Dove_siamo(View view){
        redirectActivity(this,Profilo.class,false,activity);
    }
    public void Impostazioni(View view){
        redirectActivity(this,Profilo.class,false,activity);
    }
    public void Logout(View view){
        redirectActivity(this,Profilo.class,false,activity);
    }
    public void chi_siamo(View view){
        redirectActivity(this,Profilo.class,false,activity);
    }
    public void Home(View view){
        redirectActivity(this,MainActivity.class,false,activity);
    }




    public static void redirectActivity(Activity activity, Class aclass,boolean chiudi,Activity a) {
        Intent intent = new Intent(activity,aclass);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.startActivity(intent);
        if (chiudi){
            a.finish();
        }
    }

    protected void OnPause(){
        super.onPause();
        closeMenu(drawerLayout);
    }


}