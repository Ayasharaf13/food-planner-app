package com.example.foodplanner.models;

import androidx.annotation.NonNull;
<<<<<<< HEAD
import androidx.room.ColumnInfo;
=======
>>>>>>> eca1561c37458cd3dcb6567e08125bd49145daf2
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

/*
 foreignKeys = [
            ForeignKey(
                    entity = Customer::class,
                    parentColumns = arrayOf("customer_id"),
                    childColumns = arrayOf("customer_id"),
                    onUpdate = ForeignKey.CASCADE,
                    onDelete = ForeignKey.CASCADE
            )]
 */
@Entity (tableName = "Meals_table",foreignKeys = {@ForeignKey(entity = Day.class,
        parentColumns = "day_id",
        childColumns = "day_id",
        onDelete = ForeignKey.CASCADE,
        onUpdate = ForeignKey.CASCADE)
})


public class RandomMeal {

    @PrimaryKey
    @NonNull
    public String idMeal="";

<<<<<<< HEAD
    public String date ="";

    @ColumnInfo(name = "day_id")
     public int id;

    public boolean isPlanner =false;
    public boolean isSave = false;

=======

    public String date ="";



    public boolean isPlanner =false;
    public boolean isSave = false;

>>>>>>> eca1561c37458cd3dcb6567e08125bd49145daf2
    public String strMeal="";
    public String strMealThumb="";
    public String strYoutube="";
    public String strInstructions="";

    public String strCategory ="";
    public String strArea = "";
    public String strTags ="";

    public String strIngredient1="";
    public String strIngredient2="";
    public String strIngredient3="";
    public String strIngredient4="";
    public String strIngredient5="";
    public String strIngredient6="";
    public String strIngredient7="";
    public String strIngredient8="";
    public String strIngredient9="";
    public String strIngredient10="";
    public String strIngredient11="";
    public String strIngredient12="";
    public String strIngredient13="";
    public String strIngredient14="";
    public String strIngredient15="";
    public String strIngredient16="";
    public String strIngredient17="";
    public String strIngredient18="";
    public String strIngredient19="";
    public String strIngredient20="";



<<<<<<< HEAD
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

=======
>>>>>>> eca1561c37458cd3dcb6567e08125bd49145daf2
    public boolean isPlanner() {
        return isPlanner;
    }

    public void setPlanner(boolean planner) {
        isPlanner = planner;
    }

    public boolean isSave() {
        return isSave;
    }

    public void setSave(boolean save) {
        isSave = save;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStrCategory() {
        return strCategory;
    }

    public void setStrCategory(String strCategory) {
        this.strCategory = strCategory;
    }

    public String getStrArea() {
        return strArea;
    }

    public void setStrArea(String strArea) {
        this.strArea = strArea;
    }

    public String getStrTags() {
        return strTags;
    }

    public void setStrTags(String strTags) {
        this.strTags = strTags;
    }

    public String getStrIngredient1() {
        return strIngredient1;
    }

    public void setStrIngredient1(String strIngredient1) {
        this.strIngredient1 = strIngredient1;
    }

    public String getStrIngredient2() {
        return strIngredient2;
    }

    public void setStrIngredient2(String strIngredient2) {
        this.strIngredient2 = strIngredient2;
    }

    public String getStrIngredient3() {
        return strIngredient3;
    }

    public void setStrIngredient3(String strIngredient3) {
        this.strIngredient3 = strIngredient3;
    }

    public String getStrIngredient4() {
        return strIngredient4;
    }

    public void setStrIngredient4(String strIngredient4) {
        this.strIngredient4 = strIngredient4;
    }

    public String getStrIngredient5() {
        return strIngredient5;
    }

    public void setStrIngredient5(String strIngredient5) {
        this.strIngredient5 = strIngredient5;
    }

    public String getStrIngredient6() {
        return strIngredient6;
    }

    public void setStrIngredient6(String strIngredient6) {
        this.strIngredient6 = strIngredient6;
    }

    public String getStrIngredient7() {
        return strIngredient7;
    }

    public void setStrIngredient7(String strIngredient7) {
        this.strIngredient7 = strIngredient7;
    }

    public String getStrIngredient8() {
        return strIngredient8;
    }

    public void setStrIngredient8(String strIngredient8) {
        this.strIngredient8 = strIngredient8;
    }

    public String getStrIngredient9() {
        return strIngredient9;
    }

    public void setStrIngredient9(String strIngredient9) {
        this.strIngredient9 = strIngredient9;
    }

    public String getStrIngredient10() {
        return strIngredient10;
    }

    public void setStrIngredient10(String strIngredient10) {
        this.strIngredient10 = strIngredient10;
    }

    public String getStrIngredient11() {
        return strIngredient11;
    }

    public void setStrIngredient11(String strIngredient11) {
        this.strIngredient11 = strIngredient11;
    }

    public String getStrIngredient12() {
        return strIngredient12;
    }

    public void setStrIngredient12(String strIngredient12) {
        this.strIngredient12 = strIngredient12;
    }

    public String getStrIngredient13() {
        return strIngredient13;
    }

    public void setStrIngredient13(String strIngredient13) {
        this.strIngredient13 = strIngredient13;
    }

    public String getStrIngredient14() {
        return strIngredient14;
    }

    public void setStrIngredient14(String strIngredient14) {
        this.strIngredient14 = strIngredient14;
    }

    public String getStrIngredient15() {
        return strIngredient15;
    }

    public void setStrIngredient15(String strIngredient15) {
        this.strIngredient15 = strIngredient15;
    }

    public String getStrIngredient16() {
        return strIngredient16;
    }

    public void setStrIngredient16(String strIngredient16) {
        this.strIngredient16 = strIngredient16;
    }

    public String getStrIngredient17() {
        return strIngredient17;
    }

    public void setStrIngredient17(String strIngredient17) {
        this.strIngredient17 = strIngredient17;
    }

    public String getStrIngredient18() {
        return strIngredient18;
    }

    public void setStrIngredient18(String strIngredient18) {
        this.strIngredient18 = strIngredient18;
    }

    public String getStrIngredient19() {
        return strIngredient19;
    }

    public void setStrIngredient19(String strIngredient19) {
        this.strIngredient19 = strIngredient19;
    }

    public String getStrIngredient20() {
        return strIngredient20;
    }

    public void setStrIngredient20(String strIngredient20) {
        this.strIngredient20 = strIngredient20;
    }

    public String getStrInstructions() {
        return strInstructions;
    }

    public void setStrInstructions(String strInstructions) {
        this.strInstructions = strInstructions;
    }

    public String getStrYoutube() {
        return strYoutube;
    }

    public void setStrYoutube(String strYoutube) {
        this.strYoutube = strYoutube;
    }



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



































