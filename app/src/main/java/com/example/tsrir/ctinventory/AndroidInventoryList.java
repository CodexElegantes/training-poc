package com.example.tsrir.ctinventory;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class AndroidInventoryList extends AppCompatActivity {

    ListView listView;
    ArrayList<String> androidInventory;
    ArrayAdapter arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_inventory_list);

        listView = findViewById(R.id.listview1);

        androidInventory = new ArrayList<>();

        androidInventory.add("Device:Samsung Galaxy S3, 16 GB; Owner:@Vijay Ramachandran");
        androidInventory.add("Device:Samsung Galaxy S6, 32 GB; Owner:@Ajay Sharma");
        androidInventory.add("Device:Google Pixel 3; Owner:@Sai Teja Reddy K");

        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,androidInventory);

        listView.setAdapter(arrayAdapter);


    }

    public void AddEntryScreen(View view) {
        Intent intent = new Intent(this, AddToInventory.class);
        startActivityForResult(intent,100);
    }

    public void EditEntryScreen(View view) {
        Intent intent = new Intent(this, EditInventory.class);
        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 100){
            String deviceOwner = data.getStringExtra("newDeviceOwnerEntry");
            String deviceName = data.getStringExtra("newDeviceNameEntry");
            AddEntrytoArray(deviceName,deviceOwner);
        }
    }

    public void AddEntrytoArray(String deviceName, String deviceOwner){
        androidInventory.add("Device:"+deviceName+"; Owner:"+deviceOwner);
        arrayAdapter.notifyDataSetChanged();
        listView.setAdapter(arrayAdapter);

    }
}
