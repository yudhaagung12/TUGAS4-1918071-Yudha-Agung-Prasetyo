package com.example.tugas4_1918071;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ItemAdapter adapter;
    private ArrayList<Item> itemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView=(RecyclerView)findViewById(R.id.recycleview);
        adapter = new ItemAdapter(itemArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        itemArrayList = new ArrayList<>();
        itemArrayList.add(new Item("OG","Leader:Notail","Negara:Europe",R.drawable.og));
        itemArrayList.add(new Item("Secret","Leader:Puppey","Negara:Europe",R.drawable.q));
        itemArrayList.add(new Item("Alliance","Leader:s4","Negara:Europe",R.drawable.l));
        itemArrayList.add(new Item("Fnatic","Leader:Jabz","Negara:SEA",R.drawable.f));
        itemArrayList.add(new Item("Evil Geniuses","Leader:Fly","Negara:NA",R.drawable.v));
        itemArrayList.add(new Item("Virtus Pro","Leader:Save","Negara:NA",R.drawable.m));
    }
}
