package com.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.Models.ProfileModel;
import com.dotaustere.realsexygirlsmobilenumbersforvideochat.R;

import java.util.ArrayList;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.viewHolder> {
Context context;
ArrayList<ProfileModel> profileModels;

    public ProfileAdapter(Context context, ArrayList<ProfileModel> profileModels) {
        this.context = context;
        this.profileModels = profileModels;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_profile,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        ProfileModel model= profileModels.get(position);
//        holder.profileImage.setImageResource(model.getGirlProfile());
        holder.country.setText(model.getCountryName());
        holder.contactNumber.setText(model.getContactNo());
    holder.age.setText(model.getAge());



    }

    @Override
    public int getItemCount() {
        return profileModels.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        TextView country,age,contactNumber;
        ImageView profileImage;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            country=itemView.findViewById(R.id.contary_text);
            age=itemView.findViewById(R.id.age_txt);
            contactNumber=itemView.findViewById(R.id.contact_number);
            profileImage=itemView.findViewById(R.id.profile_ha);
        }
    }

}
