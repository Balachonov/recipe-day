package balachonov.recipeday.controllers;

import balachonov.recipeday.entities.Recipe;
import balachonov.recipeday.servises.RecipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Map;

@RequiredArgsConstructor
@RestController
@RequestMapping("/")
public class RecipeController {

    private final RecipeService recipeService;
    @GetMapping
    public Recipe getRecipe(){
        Map<DayOfWeek, Recipe> recipes = recipeService.getRecipes();
        return recipes.get(LocalDate.now().getDayOfWeek());
    }
}