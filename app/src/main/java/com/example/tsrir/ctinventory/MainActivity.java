package com.example.tsrir.ctinventory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ToAndroidInventoryList(View view){
        Intent intent = new Intent(this,AndroidInventoryList.class);
        startActivity(intent);
    }

    public void ToIosInventoryList(View view){
        Intent intent = new Intent(this,IosInventoryList.class);
        startActivity(intent);
    }


}
