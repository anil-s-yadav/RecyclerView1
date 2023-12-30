package com.legendarysoftwares.recyclerview1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<ContactModel> arrContacts=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView=findViewById(R.id.recyclerContact);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

       // ContactModel contactModel=new ContactModel(R.drawable.a,"Anil Yadav","+91 9895214563");
        arrContacts.add(new ContactModel(R.drawable.a,"Anil Yadav","+91 9895214563"));
        arrContacts.add(new ContactModel(R.drawable.b,"Ajay Gupta","+91 8754125669"));
        arrContacts.add(new ContactModel(R.drawable.c,"Suraj Yadav","+91 7896541232"));
        arrContacts.add(new ContactModel(R.drawable.d,"Sandeep Yadav","+91 8965412368"));
        arrContacts.add(new ContactModel(R.drawable.e,"Ajay Yadav","+91 7896541236"));
        arrContacts.add(new ContactModel(R.drawable.f,"Mokshika Yadav","+91 8974563214"));
        arrContacts.add(new ContactModel(R.drawable.g,"Rahul Sharma","+91 8546971365"));
        arrContacts.add(new ContactModel(R.drawable.h,"Vinay Visvakarma","+91 8974563215"));
        arrContacts.add(new ContactModel(R.drawable.i,"Shi Bhagawat","+91 9874563152"));
        arrContacts.add(new ContactModel(R.drawable.j,"Anil Shah","+91 9213654789"));

        RecyclerContactAdapter adapter= new RecyclerContactAdapter(this,arrContacts);
        recyclerView.setAdapter(adapter);

    }
}