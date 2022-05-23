package model.examples;

import model.Food;
import model.FoodInterface;

import java.util.Map;

import static model.examples.Ingredients.*;

public class Dishes {
    public static final String DEFAULT_SERVING_DESCRIPTION = "Serves 1";

    // BREAKFAST
    public static final FoodInterface OMELETTE = new Food(
            "Omelette",
            DEFAULT_SERVING_DESCRIPTION,
            Map.of(
                    EGG, 2.0,
                    EGG_WHITE, 0.25,
                    SWISS_CHEESE, 2.0,
                    TOMATO, 1.0,
                    MUSHROOM, 1.0,
                    SPRING_ONION, 1.0,
                    OLIVE_OIL, 1.0
            )
    );

    public static final FoodInterface SCRAMBLED_EGGS = new Food(
        "Scrambled Eggs",
            DEFAULT_SERVING_DESCRIPTION,
            Map.of(
                    EGG, 2.0,
                    EGG_WHITE, 0.25,
                    SPRING_ONION, 1.0,
                    OLIVE_OIL, 1.0
            )
    );

    // LUNCH/DINNER
    public static final FoodInterface GRILLED_CHICKEN = new Food(
            "Grilled Chicken Breast",
            DEFAULT_SERVING_DESCRIPTION,
            Map.of(
                    CHICKEN_BREAST, 1.5,
                    OLIVE_OIL, 1.0
            )
    );

    public static final FoodInterface TURKEY_SANDWICH = new Food(
            "Turkey Sandwich",
            DEFAULT_SERVING_DESCRIPTION,
            Map.of(
                    TOAST, 2.0,
                    TURKEY_BREAST, 2.0,
                    SWISS_CHEESE, 2.0,
                    LETTUCE, 0.5,
                    TOMATO, 1.0
            )
    );
}
