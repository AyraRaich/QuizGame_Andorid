package com.example.a4506_a11201911944_aryarachimwibawa_utsppb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ContactMain extends AppCompatActivity implements ContactAdapter.OnContactClickListener{
    public RecyclerView rv;
    public ContactAdapter contactAdapter;
    public RecyclerView.LayoutManager layoutManager;
    public List<ItemContact> listContact = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_main);

        rv = findViewById(R.id.rvContact);
        //List kontak yang akan di tampilkan (nama, telepon, url gambar
        listContact.add(new ItemContact("Iron Man", "102018308"));
        listContact.add(new ItemContact("Bat Man",
                "102018309"));

        listContact.add(new ItemContact("Groot",
                "102018307"));

        listContact.add(new ItemContact("Sonic",
                "102018301"));


        contactAdapter = new ContactAdapter(listContact);
        contactAdapter.setListener(this);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        rv.setAdapter(contactAdapter);
        rv.setLayoutManager(layoutManager);

    }

    @Override
    public void onClick(View view, int position) {
        ItemContact contact = listContact.get(position);
        Toast.makeText(this, contact.getName(), Toast.LENGTH_LONG)
                .show();
    }
}