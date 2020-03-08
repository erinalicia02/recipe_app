package com.example.recipe;

public class Food {
    String name;
    int units;
    float amount;

    public Food(){

    }
    public Food(float amount, int units, String name){
        this.amount = amount;
        this.units = units;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getUnits(){
        return units;
    }

    public void setUnits(int units){
        this.units = units;
        /*
        https://en.wikipedia.org/wiki/Cooking_weights_and_measures
        1   drop
        2   smidgen
        3   pinch
        4   dash
        5   saltspoon or scruple
        6   coffeespoon
        7   Fluid dram
        8   teaspoon
        9   dessertspoon
        10  tablespoon
        11  fluid ounce
        12  wineglass
        13  gill or teacup
        14  cup
        15  pint
        16  quart
        17  pottle
        18  gallon
         */
    }

    public float getAmount(){
        return amount;
    }

    public void setAmount(float amount){
        this.amount = amount;
    }
}
