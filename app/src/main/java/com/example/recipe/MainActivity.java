package com.example.recipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void createNewRecipe(View view){
        Intent intent = new Intent(this, RecipePage.class);
        startActivity(intent);
    }

    public void loadRecipe(){
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0);
        String recipeJson = pref.getString("recipe", null);

        Recipe recipe = new Gson().fromJson(recipeJson, Recipe.class);
    }
}
