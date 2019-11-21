package be.ac.umons;

public class Whitecream extends Ingredient {
    Whitecream()  {
        super(App.ingredients.get("Whitecream").getName(), App.ingredients.get("Whitecream").getPrice());
    }
}
