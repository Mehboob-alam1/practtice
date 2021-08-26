package com.Adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dotaustere.realsexygirlsmobilenumbersforvideochat.ContactsActivity;
import com.dotaustere.realsexygirlsmobilenumbersforvideochat.R;

import java.util.ArrayList;

import com.Models.Country_model;
public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.viewHolder> {

    ArrayList<Country_model> countrylist;
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
                switch (position) {
                    case 0:
                        Intent intent=new Intent(holder.itemView.getContext(),ContactsActivity.class);
                        intent.putExtra("country",position);

                        context.startActivity(intent);
                        break;

                    case 1:
                        Intent intent1 = new Intent(context, ContactsActivity.class);
                        intent1.putExtra("country",position);
                        context.startActivity(intent1);
                        break;

                    case 2:
                        Intent intent2 = new Intent(context, ContactsActivity.class);
                        intent2.putExtra("country",position);
                        context.startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(context, ContactsActivity.class);
                        intent3.putExtra("country",position);
                        context.startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(context, ContactsActivity.class);
                        intent4.putExtra("country",position);
                        context.startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(context, ContactsActivity.class);
                        intent5.putExtra("country",position);
                        context.startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(context, ContactsActivity.class);
                        intent6.putExtra("country",position);
                        context.startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(context, ContactsActivity.class);
                        intent7.putExtra("country",position);
                        context.startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(context, ContactsActivity.class);
                        intent8.putExtra("country",position);
                        context.startActivity(intent8);
                        break;

                    case 9:
                        Intent intent9 = new Intent(context, ContactsActivity.class);
                        intent9.putExtra("country",position);
                        context.startActivity(intent9);
                        break;
                    case 10:
                        Intent intent10 = new Intent(context, ContactsActivity.class);
                        intent10.putExtra("country",position);
                        context.startActivity(intent10);
                        break;
                    case 11:
                        Intent intent11 = new Intent(context, ContactsActivity.class);
                        intent11.putExtra("country",position);
                        context.startActivity(intent11);
                        break;
                    case 12:
                        Intent intent12 = new Intent(context, ContactsActivity.class);
                        intent12.putExtra("country",position);
                        context.startActivity(intent12);
                        break;
                    case 13:
                        Intent intent13 = new Intent(context, ContactsActivity.class);
                        intent13.putExtra("country",position);
                        context.startActivity(intent13);
                        break;
                    case 14:
                        Intent intent14 = new Intent(context, ContactsActivity.class);
                        intent14.putExtra("country",position);
                        context.startActivity(intent14);
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
