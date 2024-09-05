package com.example.foodplanner.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    //https://www.themealdb.com/api/json/v1/1/random.php
    private static final String BASE_URL = "https://www.themealdb.com/";

    private static Retrofit retrofit;



    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
