package com.example.harisont.inventory_manager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddProduct extends AppCompatActivity {

    private static final String TAG = "AddProduct";

    EditText productName;
    EditText description;
    EditText price;
    EditText quantity;
    Button button;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_product);

        productName = findViewById(R.id.product_name);
        description = findViewById(R.id.description);
        price = findViewById(R.id.price);
        quantity = findViewById(R.id.price);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: save to DB
                Log.d(TAG, "Input data: " + productName.getText().toString() + "..." );
            }
        });
    }
}
