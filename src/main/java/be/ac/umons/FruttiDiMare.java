package be.ac.umons;

import be.ac.umons.Pizza;

public class FruttiDiMare extends Pizza {
    FruttiDiMare() {
        super("FruttiDiMare");
        ListIngredients.add(new Dough());
        ListIngredients.add(new TomatoSauce());
        ListIngredients.add(new Cheese());
        ListIngredients.add(new Seafood());
    }
}
