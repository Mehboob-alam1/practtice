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

import com.Models.ContactsModel;
import com.Models.Country_model;
import com.example.realsexygirlsmobilenumbersforvideochat.ContactsActivity;
import com.example.realsexygirlsmobilenumbersforvideochat.R;

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

    }


    @Override
    public int getItemCount() {
        return contactsModels.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView girlImage, whatsappIcon;


        public viewHolder(@NonNull View itemView) {
            super(itemView);
            girlImage = itemView.findViewById(R.id.girls_Image);
            whatsappIcon = itemView.findViewById(R.id.whatsapp_icon);
        }
    }
}
