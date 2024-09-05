package com.example.foodplanner.models;

public class RandomMeal {

    public String idMeal;
    public String strMeal;
    public String strMealThumb;

    public String getIdMeal() {
        return idMeal;
    }

    public void setIdMeal(String idMeal) {
        this.idMeal = idMeal;
    }

    public String getStrMeal() {
        return strMeal;
    }

    public void setStrMeal(String strMeal) {
        this.strMeal = strMeal;
    }

    public String getStrMealThumb() {
        return strMealThumb;
    }

    public void setStrMealThumb(String strMealThumb) {
        this.strMealThumb = strMealThumb;
    }
    @Override
    public String toString() {
        return "RandomMeal{" +
                "idMeal='" + idMeal + '\'' +
              //  ", strMeal='" + strMeal + '\'' +
                //", strMealThumb='" + strMealThumb + '\'' +
                '}';
    }

}






