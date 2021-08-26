package com.dotaustere.realsexygirlsmobilenumbersforvideochat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;


public class ProfileActivity extends AppCompatActivity {
    ImageView imageView;
  TextView countryName,Age,contact;
  private AdView mAdView;
    private InterstitialAd mInterstitialAd;
ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        countryName=findViewById(R.id.contary_text);
        img =findViewById(R.id.back_btn);
        Age=findViewById(R.id.age_txt);

        //INTERSTITIAL AD

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(this,"ca-app-pub-6406856513627612/5043549014", adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        mInterstitialAd = interstitialAd;
//                        Log.i("TAG", "onAdLoaded");
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        Log.i("TAG", loadAdError.getMessage());
                        mInterstitialAd = null;
                    }

                });

        contact=findViewById(R.id.contact_number);
       contact.setOnClickListener(new View.OnClickListener() {
           boolean isFirstTimeClick=true;
           @Override
           public void onClick(View view) {
//
               if(isFirstTimeClick){
                   isFirstTimeClick=false;
                   Toast.makeText(ProfileActivity.this, "You will get number after a day", Toast.LENGTH_LONG).show();
               }else {
                   isFirstTimeClick=true;

                   if (mInterstitialAd != null) {
                   mInterstitialAd.show(ProfileActivity.this);
                   finish();
               } else {
//                   Log.d("TAG", "The interstitial ad wasn't ready yet.");
               }
               }

//
           }
       });
        imageView = findViewById(R.id.profile_ha);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.adView);

        mAdView.loadAd(adRequest);
        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
                super.onAdLoaded();
//                Toast.makeText(ProfileActivity.this, "Ad Loaded", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                // Code to be executed when an ad request fails.
                mAdView.loadAd(adRequest);
            }


        });

    String age,country;
    age=getIntent().getStringExtra("age");
    country=getIntent().getStringExtra("country");
        int profileimage=getIntent().getIntExtra("image",0);
                imageView.setImageResource(profileimage);

                countryName.setText(country);
                Age.setText(age);




    }

}