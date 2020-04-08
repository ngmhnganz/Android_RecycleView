package com.nguyenminhngan.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;

import com.nguyenminhngan.adapter.ContactAdapter;
import com.nguyenminhngan.model.Contact;
import com.nguyenminhngan.recycleview.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Contact> contactList = new ArrayList<>();
    private  RecyclerView rvContact;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addFakeData();
        rvContact = findViewById(R.id.rvContact);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rvContact.setLayoutManager(layoutManager);
        rvContact.setAdapter(new ContactAdapter(this, contactList));
    }
    private void addFakeData() {
        Contact contact = new Contact(R.drawable.bubb, "093123123", "Bubble");
        contactList.add(contact);
        contact = new Contact(R.drawable.finn, "0932342123", "Finn");
        contactList.add(contact);
        contact = new Contact(R.drawable.jake, "093266775", "Jake");
        contactList.add(contact);
    }
}
