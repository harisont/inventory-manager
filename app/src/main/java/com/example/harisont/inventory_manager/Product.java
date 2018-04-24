package com.example.harisont.inventory_manager;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "product_table")
public class Product {

    @PrimaryKey(autoGenerate = true)
    protected int mId;

    @ColumnInfo(name = "name")
    protected String mName;

    @ColumnInfo(name = "description")
    protected String mDescription;

    @ColumnInfo(name = "price")
    protected float mPrice;

    @ColumnInfo(name = "quantity")
    protected int mQuantity;

    public Product(String mName, String mDescription, float mPrice, int mQuantity) {
        this.mId = mId;
        this.mName = mName;
        this.mDescription = mDescription;
        this.mPrice = mPrice;
        this.mQuantity = mQuantity;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public float getmPrice() {
        return mPrice;
    }

    public void setmPrice(float mPrice) {
        this.mPrice = mPrice;
    }

    public int getmQuantity() {
        return mQuantity;
    }

    public void setmQuantity(int mQuantity) {
        this.mQuantity = mQuantity;
    }
}
