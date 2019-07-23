package com.example.customlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView contacts;
    CustomAdapter adapter;
    ArrayList <Item> majina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contacts = findViewById(R.id.listpple);
        majina = new ArrayList<>();
        adapter = new CustomAdapter(this,majina);

        Item P1 = new Item("King","0726783400",R.drawable.whatsapp);
        Item P2 = new Item("King","0726783400",R.drawable.whatsapp);
        Item P3 = new Item("King","0726783400",R.drawable.whatsapp);
        Item P4 = new Item("King","0726783400",R.drawable.whatsapp);
        Item P5= new Item("King","0726783400",R.drawable.whatsapp);
        Item P6= new Item("King","0726783400",R.drawable.whatsapp);
        Item P7 = new Item("King","0726783400",R.drawable.whatsapp);
        Item P8 = new Item("King","0726783400",R.drawable.whatsapp);
        Item P9 = new Item("King","0726783400",R.drawable.whatsapp);
        Item P10= new Item("King","0726783400",R.drawable.whatsapp);

        contacts.setAdapter(adapter);


    }
}
