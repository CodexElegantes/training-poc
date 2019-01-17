package com.example.tsrir.ctinventory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IosInventoryList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ios_inventory_list);
    }

    public void AddEntryScreen(View view) {
        Intent intent = new Intent(this, AddToInventory.class);
        startActivity(intent);
    }

    public void EditEntryScreen(View view) {
        Intent intent = new Intent(this, EditInventory.class);
        startActivity(intent);
    }

}
