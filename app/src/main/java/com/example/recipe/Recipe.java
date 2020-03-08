package com.example.recipe;

import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

public class Recipe {
    //Instance Variables
    String name;
    int time;
    float calories;
    float protein;
    float fat;
    float carb;
    List ingrediants;
    List steps;

    //public default constructor needed for creating new instance of recipe object.
    public Recipe(){

    }

    //Constructor Declaration of Class
    public Recipe(String name, int time, float calories, float protein, float fat, float carb, List ingrediants, List steps){
        this.name = name;
        this.time = time;
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.carb = carb;
        this.ingrediants = ingrediants;
        this.steps = steps;
    }

    //method 1
    public String getName(){
        return name;
    }

    //method 2
    public int getTime(){
        return time;
    }

    //method 3
    public float getCalories(){
        return calories;
    }

    //method 4
    public float getProtein() {
        return protein;
    }

    //method 5
    public float getFat() {
        return fat;
    }

    //method 6
    public float getCarb() {
        return carb;
    }

    //method 7
    public List getIngrediants() {
        return ingrediants;
    }

    //method 8
    public List getSteps() {
        return steps;
    }

    @Override
    public String toString(){
        return "The name of the recipe is " + this.getName() +
                ".\nThe length of time needed to prepare this recipe is: " +
                this.getTime() + " minutes" + ".\nThe ingredients are: ";
                for (int i = 0; i < this.ingrediants.size(); i++) {
                    System.out.println(i + ". " + i.getName() + ".\n");
                }
        System.out.println("The steps are");
                for (int i = 0; i < this.steps.size(); i++) {
                    System.out.println(steps.get(i));
                }
    }

    public static void main(String[] args){
        Recipe mac = new Recipe("Mac & Cheese",15,5, 10, 7, 42, (List) Arrays.asList(new Food(1,2,"Chicken"),new Food(2,1,"Meat")), (List) Arrays.asList("step 1", "step 2", "step 3"));
        System.out.println(mac.toString());
    }
}
