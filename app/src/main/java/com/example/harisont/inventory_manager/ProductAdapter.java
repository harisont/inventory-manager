package com.example.harisont.inventory_manager;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {

    List<Product> products;

    public ProductAdapter(List<Product> products) {
        this.products = products;
    }

    @NonNull
    @Override
    public ProductAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_row, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final ProductAdapter.ViewHolder holder, final int position) {
        holder.productName.setText(products.get(position).getmName());                              // Uhm what's happening here?
        holder.description.setText(products.get(position).getmDescription());
        holder.price.setText("Price: " + Float.toString(products.get(position).getmPrice()) + "$");
        holder.quantity.setText("Available: " + Integer.toString(products.get(position).getmQuantity()));
        holder.minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.db.productDao().decreaseQuantity(products.get(position).getmId());
                products.get(position).updateQuantity();
                holder.quantity.setText("Available: " + Integer.toString(products.get(position).getmQuantity()));
            }
        });
        holder.plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.db.productDao().increaseQuantity(products.get(position).getmId());
                products.get(position).updateQuantity();
                holder.quantity.setText("Available: " + Integer.toString(products.get(position).getmQuantity()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView productName;
        public TextView description;
        public TextView price;
        public TextView quantity;
        public Button minus;
        public Button plus;

        public ViewHolder(View itemView) {
            super(itemView);
            productName = itemView.findViewById(R.id.product_name);
            description = itemView.findViewById(R.id.description);
            price = itemView.findViewById(R.id.price);
            quantity = itemView.findViewById(R.id.quantity);
            minus = itemView.findViewById(R.id.minus);
            plus = itemView.findViewById(R.id.plus);
        }
    }
}
