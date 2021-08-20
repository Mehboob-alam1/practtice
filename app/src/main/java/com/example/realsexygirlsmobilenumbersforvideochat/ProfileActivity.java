package com.example.realsexygirlsmobilenumbersforvideochat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.Adapters.CountryAdapter;
import com.Adapters.ProfileAdapter;
import com.Models.ProfileModel;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ProfileActivity extends AppCompatActivity {
    ImageView imageView;
  TextView countryName,Age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        countryName=findViewById(R.id.contary_text);
        Age=findViewById(R.id.age_txt);
        imageView = findViewById(R.id.profile_ha);

    String age,country;
    age=getIntent().getStringExtra("age");
    country=getIntent().getStringExtra("country");
        int profileimage=getIntent().getIntExtra("image",0);
                imageView.setImageResource(profileimage);

                countryName.setText(country);
                Age.setText(age);




    }
}