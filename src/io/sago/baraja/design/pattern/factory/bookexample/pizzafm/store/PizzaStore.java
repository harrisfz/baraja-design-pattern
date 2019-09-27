package io.sago.baraja.design.pattern.factory.bookexample.pizzafm.store;

import io.sago.baraja.design.pattern.factory.bookexample.pizzafm.pizza.Pizza;

public abstract class PizzaStore {

    abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
