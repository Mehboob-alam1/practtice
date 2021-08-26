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

import com.Models.ContactsModel;
import com.dotaustere.realsexygirlsmobilenumbersforvideochat.ProfileActivity;
import com.dotaustere.realsexygirlsmobilenumbersforvideochat.R;

import java.util.ArrayList;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.viewHolder> {
    ArrayList<ContactsModel> contactsModels;
    Context context;


    public ContactsAdapter(ArrayList<ContactsModel> contactsModels, Context context) {
        this.contactsModels = contactsModels;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.contacts_sample, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, @SuppressLint("RecyclerView") int position) {
        ContactsModel model = contactsModels.get(position);
        holder.girlImage.setImageResource(model.getGirlImage());
        holder.whatsappIcon.setImageResource(model.getWhatsappIcon());
        holder.girlName.setText(model.getGirlName());
        holder.girlImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(context, "item " + position, Toast.LENGTH_SHORT).show();
               Intent intent= new Intent(holder.itemView.getContext(), ProfileActivity.class);
               intent.putExtra("image",model.getGirlImage());
               intent.putExtra("age",model.getAge());
               intent.putExtra("country",model.getCountry());
               context.startActivity(intent);


            }
        });

    }


    @Override
    public int getItemCount() {
        return contactsModels.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView girlImage, whatsappIcon;
   TextView girlName;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
girlName=itemView.findViewById(R.id.girli_name);
        girlImage = itemView.findViewById(R.id.girls_Image);
            whatsappIcon = itemView.findViewById(R.id.whatsapp_icon);
        }
    }
}
