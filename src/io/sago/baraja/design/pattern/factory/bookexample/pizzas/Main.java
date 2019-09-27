package io.sago.baraja.design.pattern.factory.bookexample.pizzas;

import io.sago.baraja.design.pattern.factory.bookexample.pizzas.pizza.Pizza;
import io.sago.baraja.design.pattern.factory.bookexample.pizzas.pizza.SimplePizzaFactory;
import io.sago.baraja.design.pattern.factory.bookexample.pizzas.store.PizzaStore;

public class Main {

    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);

        pizza = store.orderPizza("veggie");
        System.out.println("We ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);
    }
}
