package com.example.recipe;

import org.springframework.web.bind.annotation.*;
import com.example.recipe.RecipeService;
import com.example.recipe.Recipe;

import java.util.*;

@RestController
public class RecipeController {
    RecipeService recipeService = new RecipeService();

    @GetMapping("/recipes")
    public ArrayList<Recipe> getRecipes() {
        return recipeService.getRecipes();
    }

    @PostMapping("/recipes")
    public Recipe addRecipes(@RequestBody Recipe recipe) {
        return recipeService.addRecipes(recipe);
    }

    @GetMapping("/recipes/{recipeId}")
    public Recipe getRecipeById(@PathVariable("recipeId") int recipeId) {
        return recipeService.getRecipeById(recipeId);
    }

    @PutMapping("/recipes/{recipeId")
    public Recipe updateRecipe(@PathVariable("recipeId") int recipeId, @RequestBody Recipe recipe) {
        return recipeService.updateRecipe(recipeId, recipe);
    }

    @DeleteMapping("/recipes/{recipeId}")
    public void deleteById(@PathVariable("recipeId") int recipeId) {
        recipeService.deleteById(recipeId);
    }

}