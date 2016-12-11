package abstractFactory.concreteFactory;

import abstractFactory.abstractFactory.PizzaStore;
import abstractFactory.abstractProduct.Pizza;
import abstractFactory.concreteFactory.impl.NYPizzaIngredientFactory;
import abstractFactory.product.CheesePizza;
import abstractFactory.product.ClamPizza;
import abstractFactory.product.PepperoniPizza;
import abstractFactory.product.VeggiePizza;


/**
 * Created by XY on 2016/11/13.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if ("cheese".equals(type)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if ("veggie".equals(type)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if ("clam".equals(type)) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }


}
