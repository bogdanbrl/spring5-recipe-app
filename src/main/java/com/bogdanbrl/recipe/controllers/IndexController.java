package com.bogdanbrl.recipe.controllers;

import com.bogdanbrl.recipe.domain.Category;
import com.bogdanbrl.recipe.domain.UnitOfMeasure;
import com.bogdanbrl.recipe.repositories.CategoryRepository;
import com.bogdanbrl.recipe.repositories.UnitOfMeasureRepository;
import com.bogdanbrl.recipe.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/", "/index"})
    public String getIndexPage(Model model){

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }


}
