package com.droidverine.nearbyplaces.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.droidverine.nearbyplaces.Adapters.ContactAdapter;
import com.droidverine.nearbyplaces.R;
import com.droidverine.nearbyplaces.models.contact;

import java.util.ArrayList;
import java.util.List;


public class ContactsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        getSupportActionBar().setTitle("Contacts");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        List<contact> contactList=new ArrayList<>();

        contact contact=new contact("100","Police","");
        contact contact1=new contact("102","Fire Brigade","");
        contact contact2=new contact("108","Disaster management","");
        contact contact3=new contact("1814","Women's helpline","");

        contactList.add(contact);
        contactList.add(contact1);
        contactList.add(contact2);
        contactList.add(contact3);

        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.contactsrecycler);
        LinearLayoutManager layoutmanager = new LinearLayoutManager(getApplicationContext());
        layoutmanager.setReverseLayout(false);
        layoutmanager.setStackFromEnd(false);
        recyclerView.setLayoutManager(layoutmanager);
        recyclerView.setItemAnimator( new DefaultItemAnimator());
        ContactAdapter contactAdapter=new ContactAdapter(getApplicationContext(),contactList);

        recyclerView.setAdapter(contactAdapter);

    }
}
