package com.example.avis;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

public class where_we_are extends AppCompatActivity {

    DrawerLayout drawerLayout;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_where_we_are);
        drawerLayout = findViewById(R.id.drawer_layout);
        textView = findViewById(R.id.nome_activity);
        textView.setText("Dove siamo");

    }

    public void Profile(View view){
        HomePage.redirectActivity(this, Profile.class,false);
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
<<<<<<< Updated upstream
}
=======


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

>>>>>>> Stashed changes
