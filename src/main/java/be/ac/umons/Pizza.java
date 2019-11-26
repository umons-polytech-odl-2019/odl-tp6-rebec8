package be.ac.umons;

import be.ac.umons.Ingredient;

import java.util.ArrayList;

public class Pizza implements PizzaComponent {
    private String name;
    private float price = 2;
    protected ArrayList<Ingredient> ListIngredients;

    public Pizza(String name) {
        this.name = name;
    }

    public Pizza(String name, float price, ArrayList<Ingredient> ListIngredients) {
        this.name = name;
        this.price = price;
        this.ListIngredients = ListIngredients;
    }


    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public ArrayList<Ingredient> ListIngredients() {
        return ListIngredients;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void addIngredient(Ingredient i)
    {
        ListIngredients.add(i);
    }

    public String toString()
    {
        String s = getName() + " (";
        for (Ingredient ing : ListIngredients)
            s = s + ing.getName() + " ";
        s = s + ") " + String.valueOf(price);
        return s;
    }

}
