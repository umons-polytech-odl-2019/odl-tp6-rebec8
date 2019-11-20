package be.ac.umons;import be.ac.umons.Pizza;

import java.math.BigDecimal;
import be.ac.umons.Ingredient;

public class Cheese extends Ingredient {
    Cheese() {
        BigDecimal price = new BigDecimal("");
        super("Cheese", price);
    }
}
