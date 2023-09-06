package balachonov.recipeday.entities;

import lombok.Builder;
import lombok.Data;

import java.time.DayOfWeek;


@Data
@Builder
public class Recipe {

    private DayOfWeek dayOfWeek;

    private String complexity;

    private String recipeDescription;
}