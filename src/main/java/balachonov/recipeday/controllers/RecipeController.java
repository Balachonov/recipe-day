package balachonov.controllers;

import balachonov.entities.Recipe;
import balachonov.servises.RecipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.DayOfWeek;
import java.util.Map;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class RecipeController {

    private final RecipeService RECIPE_SERVICE;
    @GetMapping("/recipe")
    public Recipe getRecipe(@RequestParam DayOfWeek day){
        Map<DayOfWeek, Recipe> recipes = RECIPE_SERVICE.getRecipes();
        return recipes.get(day);
    }
}
