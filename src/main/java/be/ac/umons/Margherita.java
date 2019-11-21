package be.ac.umons;

import be.ac.umons.Pizza;

public class Margherita extends Pizza {
    Margherita() {
        super("Margherita");
        ListIngredients.add(new Dough());
        ListIngredients.add(new TomatoSauce());
        ListIngredients.add(new Cheese());
    }

}
