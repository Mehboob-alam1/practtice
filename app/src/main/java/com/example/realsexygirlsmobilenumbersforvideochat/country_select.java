package com.example.realsexygirlsmobilenumbersforvideochat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import com.Adapters.CountryAdapter;
import com.Models.Country_model;

public class country_select extends AppCompatActivity {
  RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_select);
        recyclerView=findViewById(R.id.recycler_view);

        ArrayList<Country_model> country_list = new ArrayList<>();
        country_list.add(new Country_model(R.drawable.austrailia,R.drawable.whatsapp,"Austrailia"));
        country_list.add(new Country_model(R.drawable.bangladesh,R.drawable.whatsapp,"Bangladesh"));
        country_list.add(new Country_model(R.drawable.iceland,R.drawable.whatsapp,"IceLand"));
        country_list.add(new Country_model(R.drawable.india,R.drawable.whatsapp,"India"));
        country_list.add(new Country_model(R.drawable.italy,R.drawable.whatsapp,"Italy"));
        country_list.add(new Country_model(R.drawable.japan,R.drawable.whatsapp,"Japan"));
        country_list.add(new Country_model(R.drawable.north_korea,R.drawable.whatsapp,"North Korea"));
        country_list.add(new Country_model(R.drawable.pakistan,R.drawable.whatsapp,"Pakistan"));
        country_list.add(new Country_model(R.drawable.sahrawi_arab_democratic_republic,R.drawable.whatsapp,"Arab republic"));
        country_list.add(new Country_model(R.drawable.senegal,R.drawable.whatsapp,"Senegal"));
        country_list.add(new Country_model(R.drawable.south_korea,R.drawable.whatsapp,"South korea"));
        country_list.add(new Country_model(R.drawable.turkey,R.drawable.whatsapp,"Turkey"));
        country_list.add(new Country_model(R.drawable.uae,R.drawable.whatsapp,"UAE"));
        country_list.add(new Country_model(R.drawable.united_states,R.drawable.whatsapp,"United States"));
        country_list.add(new Country_model(R.drawable.uzbakistan,R.drawable.whatsapp,"Uzbakistan "));

        CountryAdapter adapter =new CountryAdapter(country_list,this);

        recyclerView.setAdapter(adapter);
        GridLayoutManager gridLayoutManager =new GridLayoutManager(this,3);
       recyclerView.setLayoutManager(gridLayoutManager);
    }
}