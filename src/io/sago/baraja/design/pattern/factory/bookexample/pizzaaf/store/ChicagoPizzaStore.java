package io.sago.baraja.design.pattern.factory.bookexample.pizzaaf.store;

import io.sago.baraja.design.pattern.factory.bookexample.pizzaaf.ingridient.ChicagoPizzaIngredientFactory;
import io.sago.baraja.design.pattern.factory.bookexample.pizzaaf.ingridient.PizzaIngredientFactory;
import io.sago.baraja.design.pattern.factory.bookexample.pizzaaf.pizza.*;

public class ChicagoPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new ChicagoPizzaIngredientFactory();

        if (item.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");

        } else if (item.equals("veggie")) {

            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");

        } else if (item.equals("clam")) {

            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");

        } else if (item.equals("pepperoni")) {

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");

        }
        return pizza;
    }
}
