package com.example.final_project2;


import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class ItemClass {
    private String mName;
    private String mImageUrl;

    public ItemClass() {
        //empty constructor needed
    }

    public ItemClass(String name, String imageUrl) {
        if (name.trim().equals("")) {
            name = "No Name";
        }

        mName = name;
        mImageUrl = imageUrl;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }
}