package be.ac.umons;import be.ac.umons.Pizza;

import java.math.BigDecimal;
import be.ac.umons.Ingredient;

public class Cheese extends Ingredient {
    Cheese() {
        super(App.ingredients.get("Cheese").getName(), App.ingredients.get("Cheese").getPrice());
    }
}
