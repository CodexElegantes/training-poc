package com.example.tsrir.ctinventory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddToInventory extends AppCompatActivity {

   // private Button saveButton = findViewById(R.id.button7);
    private EditText deviceName ;
    private EditText deviceOwner ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_inventory);

        deviceName = findViewById(R.id.editText2);
         deviceOwner = findViewById(R.id.editText);
    }

    public void UpdatedInventory(View view) {
        Log.d("d","inside update");
        Intent intent = new Intent();
        intent.putExtra("newDeviceNameEntry", deviceName.getText().toString());
        intent.putExtra("newDeviceOwnerEntry", deviceOwner.getText().toString());
        setResult(101,intent);
        finish();

    }

    public void UnchangedInventory(View view) {
        Intent intent = new Intent(this, AndroidInventoryList.class);
        startActivity(intent);
    }
}
