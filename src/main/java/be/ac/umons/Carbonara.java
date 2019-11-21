package be.ac.umons;

import be.ac.umons.Pizza;

public class Carbonara extends Pizza {
    Carbonara() {
        super("Carbonara");
        ListIngredients.add(new Dough());
        ListIngredients.add(new Whitecream());
        ListIngredients.add(new Cheese());
        ListIngredients.add(new Ham());
    }
}
