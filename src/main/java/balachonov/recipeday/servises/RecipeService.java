package balachonov.recipeday.servises;

import balachonov.recipeday.entities.Recipe;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.util.Map;

import static balachonov.recipeday.utils.Constants.*;

@Service
public class RecipeService {

    public Map<DayOfWeek, Recipe> getRecipes() {
       return Map.of(DayOfWeek.MONDAY, Recipe.builder()
                        .dayOfWeek(DayOfWeek.MONDAY)
                        .complexity(EASY)
                        .recipeDescription(MONDAY_RECIPE)
                        .build(),
                DayOfWeek.TUESDAY, Recipe.builder()
                        .dayOfWeek(DayOfWeek.TUESDAY)
                        .complexity(MEDIUM)
                        .recipeDescription(TUESDAY_RECIPE)
                        .build(),
                DayOfWeek.WEDNESDAY, Recipe.builder()
                        .dayOfWeek(DayOfWeek.WEDNESDAY)
                        .complexity(EASY)
                        .recipeDescription(WEDNESDAY_RECIPE)
                        .build(),
                DayOfWeek.THURSDAY, Recipe.builder()
                        .dayOfWeek(DayOfWeek.THURSDAY)
                        .complexity(EASY)
                        .recipeDescription(THURSDAY_RECIPE)
                        .build(),
                DayOfWeek.FRIDAY, Recipe.builder()
                        .dayOfWeek(DayOfWeek.FRIDAY)
                        .complexity(DIFFICULT)
                        .recipeDescription(FRIDAY_RECIPE)
                        .build(),
                DayOfWeek.SATURDAY, Recipe.builder()
                        .dayOfWeek(DayOfWeek.SATURDAY)
                        .complexity(DIFFICULT)
                        .recipeDescription(SATURDAY_RECIPE)
                        .build(),
                DayOfWeek.SUNDAY, Recipe.builder()
                        .dayOfWeek(DayOfWeek.SUNDAY)
                        .complexity(EASY)
                        .recipeDescription(SUNDAY_RECIPE)
                        .build());
    }
}