package com.example.foodplanner.models;

import android.graphics.drawable.Drawable;

public class Country {

   String nameCountry;
    Drawable image;

    public Country(String nameCountry, Drawable image){

        this.nameCountry=nameCountry;
        this.image = image;

    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }






}
