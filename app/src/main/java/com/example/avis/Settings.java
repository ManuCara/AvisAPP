package com.example.avis;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.drawerlayout.widget.DrawerLayout;

public class Settings extends AppCompatActivity {
    TextView onOfText;
    TextView textView;
    ImageView onOfBackground;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        onOfText=findViewById(R.id.notification_on_of_text);
        onOfBackground=findViewById(R.id.notification_on_of_background);
        textView = findViewById(R.id.nome_activity);
        textView.setText(R.string.settings);
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
    public void Notification(View view){
        if (onOfText.getText().equals("ON")){
        onOfBackground.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.notification_off));
        onOfText.setText(R.string.off);
    }else {
            onOfBackground.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.notification_on));
            onOfText.setText(R.string.on);
        }
    }
    public void Privacy(View view){
        //implement action
    }
    public void terms_of_condition(View view){
        //implement action
    }
    public void logoutFromSettings(View view){
        //implement action
    }

}