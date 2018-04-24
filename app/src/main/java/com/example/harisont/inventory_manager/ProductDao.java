package com.example.harisont.inventory_manager;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface ProductDao {
    @Query("SELECT * from product_table")
    List<Product> getAllProducts();

    @Insert
    void insertAll(Product... products);
}
