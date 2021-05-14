package com.example.avis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    DrawerLayout drawerLayout;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profilo);
        drawerLayout = findViewById(R.id.drawer_layout);
        textView = findViewById(R.id.nome_activity);
        textView.setText("Profilo");
        
    }

    public void Profile(View view){
        HomePage.closeMenu(drawerLayout);
    }
    public void Contact_us(View view){
        HomePage.redirectActivity(this, Contact_us.class,false);
    }
    public void Home(View view){
        HomePage.redirectActivity(this, HomePage.class,true);
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