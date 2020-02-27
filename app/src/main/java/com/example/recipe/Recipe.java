package com.example.recipe;

public class Recipe {
    //Instance Variables
    String name;
    int time;
    float calories;
    float protein;
    float fat;
    float carb;
    int numOfIngrediants;
    int numOfSteps;

    //Constructor Declaration of Class
    private Recipe(String name, int time, float calories, float protein, float fat, float carb, int numOfIngrediants, int numOfSteps){
        this.name = name;
        this.time = time;
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.carb = carb;
        this.numOfIngrediants = numOfIngrediants;
        this.numOfSteps = numOfSteps;
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
    public int getNumOfIngrediants() {
        return numOfIngrediants;
    }

    //method 8
    public int getNumOfSteps() {
        return numOfSteps;
    }

    @Override
    public String toString(){
        return "The name of the recipe is " + this.getName() +
                ".\nThe length of time needed to prepare this recipe is: " +
                this.getTime() + " minutes" + ".\nThe number of ingredients is " +
                this.getNumOfIngrediants() + ", and the number of steps is " +
                this.getNumOfSteps() + ".\n";
    }

    public static void main(String[] args){
        Recipe mac = new Recipe("Mac & Cheese",15,5, 10, 7, 42, 3,2);
        System.out.println(mac.toString());
    }
}
