package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

public class RecipePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_page);

        Intent intent = getIntent();
    }

    public void saveRecipe(View view){
        Recipe recipe = new Recipe();

        TextView name = findViewById(R.id.txtName);
        TextView time = findViewById(R.id.txtTime);
        TextView calories = findViewById(R.id.txtCalories);
        TextView protein = findViewById(R.id.txtProtein);
        TextView fat = findViewById(R.id.txtFat);
        TextView carbs = findViewById(R.id.txtCarbs);
        TextView numIngredients = findViewById(R.id.txtNumIngredience);
        TextView numSteps = findViewById(R.id.txtnumSteps);


        recipe.name = name.getText().toString();
        recipe.time = Integer.valueOf(time.getText().toString());
        recipe.calories = Float.valueOf(calories.getText().toString());
        recipe.protein = Float.valueOf(protein.getText().toString());
        recipe.fat = Float.valueOf(fat.getText().toString());
        recipe.carb = Float.valueOf(carbs.getText().toString());
        //Needs updated for Foood object & steps list
        //recipe.numOfIngrediants = Integer.valueOf(numIngredients.getText().toString());
        //recipe.numOfSteps = Integer.valueOf(numSteps.getText().toString());

        Gson gson = new Gson();

        String recipeJson = gson.toJson(recipe);

        System.out.println(recipeJson);
        SharedPreferences pref = getApplicationContext().getSharedPreferences("myPref", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("recipe", recipeJson); // change so it saves the recipe as recipe.name when everything else is finished.
        editor.apply();

        Toast toast = Toast.makeText(this, "recipe saved", Toast.LENGTH_SHORT);
        toast.show();
    }
}
