package com.example.harisont.inventory_manager;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
        quantity = findViewById(R.id.quantity);
        button = findViewById(R.id.button);

        final AppDatabase db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "production")
                .allowMainThreadQueries()                                                           /*worst practice*/
                .build();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Product product = new Product(
                        productName.getText().toString(),
                        description.getText().toString(),
                        Float.parseFloat(price.getText().toString()),
                        Integer.parseInt(quantity.getText().toString()));
                    db.productDao().insertAll(product);
                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Invalid input", Toast.LENGTH_SHORT).show();
                }
                startActivity(new Intent(AddProduct.this, MainActivity.class));
            }
        });
    }
}
