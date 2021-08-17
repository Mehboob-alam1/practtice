package com.example.realsexygirlsmobilenumbersforvideochat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.Adapters.ContactsAdapter;
import com.Models.ContactsModel;

import java.util.ArrayList;

public class ContactsActivity extends AppCompatActivity {
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        recyclerView=findViewById(R.id.recycler_contact);

        int country_position = getIntent().getIntExtra("country",0);

        if (country_position == 0){
            ArrayList<ContactsModel> list1=new ArrayList<>();
            list1.add(new ContactsModel(R.drawable.client,R.drawable.whatsapp));
            ContactsAdapter adapter0=new ContactsAdapter(list1,this);
            recyclerView.setAdapter(adapter0);
            GridLayoutManager grid0 =new GridLayoutManager(this,3);
            recyclerView.setLayoutManager(grid0);

        }else if (country_position == 1){
            ArrayList<ContactsModel> list2=new ArrayList<>();
            list2.add(new ContactsModel(R.drawable.austrailia,R.drawable.whatsapp));
            ContactsAdapter adapter1=new ContactsAdapter(list2,this);
            recyclerView.setAdapter(adapter1);
            GridLayoutManager grid1 =new GridLayoutManager(this,3);
            recyclerView.setLayoutManager(grid1);


        }

    }

}