package com.bogdanbrl.recipe.controllers;

import com.bogdanbrl.recipe.domain.Category;
import com.bogdanbrl.recipe.domain.UnitOfMeasure;
import com.bogdanbrl.recipe.repositories.CategoryRepository;
import com.bogdanbrl.recipe.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/", "/index"})
    public String getIndexPage(){

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> optionalUnitOfMeasure = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Category id is: " + categoryOptional.get().getId());
        System.out.println("Unit of measure id is: " + optionalUnitOfMeasure.get().getId());

        return "index";
    }


}
