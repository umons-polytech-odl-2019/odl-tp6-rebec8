package be.ac.umons;

import be.ac.umons.Pizza;

public class Prosciutto extends Pizza {
    Prosciutto() {
        super("Prosciutto");
        ListIngredients.add(new Dough());
        ListIngredients.add(new TomatoSauce());
        ListIngredients.add(new Cheese());
        ListIngredients.add(new Ham());
    }
}
