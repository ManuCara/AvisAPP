package com.example.avis;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import java.util.Random;

public class blood_weather extends AppCompatActivity {

    DrawerLayout drawerLayout;
    TextView textView;
    ImageView zero_pos,zero_neg;
    ImageView a_pos,a_neg;
    ImageView b_pos,b_neg;
    ImageView ab_pos,ab_neg;

    ImageView [] condition={
            zero_pos,zero_neg,  //0,1
            a_pos,a_neg,        //2,3
            b_pos,b_neg,        //4,5
            ab_pos,ab_neg       //6,7
    };  //8

    int [] weather={
            R.drawable.sun,                 //0
            R.drawable.partly_cloudy_day,   //1
            R.drawable.wet,                  //2
            R.drawable.cloud_lightning      //3
    };  //4

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_weather);
        drawerLayout = findViewById(R.id.drawer_layout);
        textView = findViewById(R.id.nome_activity);
        textView.setText("Meteo del sangue");



        condition[0] = findViewById(R.id.weater_zero_pos);
        condition[1] = findViewById(R.id.weater_zero_neg);

        condition[2] = findViewById(R.id.weater_a_pos);
        condition[3] = findViewById(R.id.weater_a_neg);

        condition[4] = findViewById(R.id.weater_b_pos);
        condition[5] = findViewById(R.id.weater_b_neg);

        condition[6] = findViewById(R.id.weater_ab_pos);
        condition[7] = findViewById(R.id.weater_ab_neg);



        for (int i = 0;i<8;i++){
            int rand =new Random().nextInt(101);

            if (rand < 26){
                condition[i].setImageResource(weather[3]);
            }else if (rand < 51){
                condition[i].setImageResource(weather[2]);
            }else if (rand < 75){
                condition[i].setImageResource(weather[1]);
            }else {
                condition[i].setImageResource(weather[0]);
            }


        }


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
}