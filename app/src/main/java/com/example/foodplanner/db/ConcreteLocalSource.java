package com.example.foodplanner.db;

import android.content.Context;
import android.util.Log;

public class ConcreteLocalSource implements LocalSource{

Context context;


private ConcreteLocalSource(Context context) {

    this.context =context;
}

private static ConcreteLocalSource localSource = null;

public static synchronized  ConcreteLocalSource getInstance(Context context){
    if(localSource == null){
      localSource =  new ConcreteLocalSource(context);
    }
    return localSource;
}


    @Override
    public void getSavedData() {
        Log.i("testtt","storedData");
    }
}
