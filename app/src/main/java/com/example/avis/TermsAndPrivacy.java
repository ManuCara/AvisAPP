package com.example.avis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TermsAndPrivacy extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_and_privacy);
        TextView textView = findViewById(R.id.nome_activity);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("type");
            textView.setText(value);
        }
    }

    public void Profile(View view){
        HomePage.redirectActivity(this, Profile.class,false);
    }
    public void Contact_us(View view){
        HomePage.redirectActivity(this, Contact_us.class,false);
    }
    public void Home(View view){
        HomePage.redirectActivity(this, Settings.class,true);
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