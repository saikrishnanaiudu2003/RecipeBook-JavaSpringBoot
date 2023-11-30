package com.example.recipe;

import java.util.*;

public interface RecipeRepository {
    ArrayList<Recipe> getRecipes();

    Recipe addRecipes(Recipe recipe);

    Recipe getRecipeById(int recipeId);

    Recipe updateRecipe(int recipeId, Recipe recipe);

    void deleteById(int recipeId);

}