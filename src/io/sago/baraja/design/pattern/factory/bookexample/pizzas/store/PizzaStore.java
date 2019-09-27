package io.sago.baraja.design.pattern.factory.bookexample.pizzas.store;

import io.sago.baraja.design.pattern.factory.bookexample.pizzas.pizza.Pizza;
import io.sago.baraja.design.pattern.factory.bookexample.pizzas.pizza.SimplePizzaFactory;

public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
