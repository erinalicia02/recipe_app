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
    }

    public float getAmount(){
        return amount;
    }

    public void setAmount(float amount){
        this.amount = amount;
    }
}
