package io.sago.baraja.design.pattern.factory.bookexample.pizzaaf.pizza;

import io.sago.baraja.design.pattern.factory.bookexample.pizzaaf.ingridient.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
