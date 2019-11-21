package be.ac.umons;

import be.ac.umons.App;

public class Ham extends Ingredient {
    Ham()  {
        super(App.ingredients.get("Ham").getName(), App.ingredients.get("Ham").getPrice());
    }
}
