package com.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.realsexygirlsmobilenumbersforvideochat.ContactsActivity;
import com.example.realsexygirlsmobilenumbersforvideochat.R;

import java.util.ArrayList;

import com.Models.Country_model;
public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.viewHolder> {

    ArrayList<Country_model> countrylist;
    //
//    ArrayList<ContactsModel> contactsModels;

    Context context;


    public CountryAdapter(ArrayList<Country_model> countrylist, Context context) {
        this.countrylist = countrylist;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_layout, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, @SuppressLint("RecyclerView") int position) {


        Country_model model = countrylist.get(position);

        holder.country_image.setImageResource(model.getCountry_pic());
        holder.whatsapp_image.setImageResource(countrylist.get(position).getWhatsapp_pic());
        holder.country_name.setText(countrylist.get(position).getText());
        holder.country_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "item " + position, Toast.LENGTH_SHORT).show();
                switch (position) {
                    case 0:
                        Intent intent=new Intent(holder.itemView.getContext(),ContactsActivity.class);
//                        Intent intent = new Intent(context, ContactsActivity.class);
                        intent.putExtra("country",position);
                        context.startActivity(intent);
                        break;

                    case 1:
                        Intent intent1 = new Intent(context, ContactsActivity.class);
                        intent1.putExtra("country",position);
                        context.startActivity(intent1);
                        break;
                }

            }


        });


    }

    @Override
    public int getItemCount() {
        return countrylist.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView country_image, whatsapp_image;
        TextView country_name;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            country_image = itemView.findViewById(R.id.country_pic);
            country_name = itemView.findViewById(R.id.country_name);
            whatsapp_image = itemView.findViewById(R.id.whatsapp_image);
        }
    }
}
