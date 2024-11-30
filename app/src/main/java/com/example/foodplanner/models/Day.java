package com.example.foodplanner.models;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;



@Entity (tableName = "day_table")
public class Day {

    @PrimaryKey(autoGenerate = true)

    @ColumnInfo(name = "day_id")
    public int id;

    public String dayName ;

    public Day(String dayName) {
        this.dayName = dayName;
    }


}
