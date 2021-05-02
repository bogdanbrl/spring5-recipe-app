package com.bogdanbrl.recipe.services;

import com.bogdanbrl.recipe.commands.RecipeCommand;
import com.bogdanbrl.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long id);

    RecipeCommand findCommandById(Long id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(Long idToDelete);
}
