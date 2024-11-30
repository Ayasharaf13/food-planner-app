package com.example.foodplanner.utilizing;



import java.util.HashMap;
import java.util.Map;

public class DayOfWeekMapper {
    private static final Map<String, Integer> dayToPositionMap = new HashMap<>();

    static {
        dayToPositionMap.put("Saturday", 0);
        dayToPositionMap.put("Sunday", 1);
        dayToPositionMap.put("Monday", 2);
        dayToPositionMap.put("Tuesday", 3);
        dayToPositionMap.put("Wednesday", 4);
        dayToPositionMap.put("Thursday", 5);
        dayToPositionMap.put("Friday", 6);
    }

    public static int getPositionForDay(String day) {
        Integer position = dayToPositionMap.get(day);
        if (position == null) {
            throw new IllegalArgumentException("Invalid day of the week: " + day);
        }
        return position +1;
    }
}
