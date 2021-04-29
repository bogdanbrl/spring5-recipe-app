package com.bogdanbrl.recipe.services;

import com.bogdanbrl.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
