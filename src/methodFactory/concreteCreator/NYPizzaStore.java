package methodFactory.concreteCreator;

import methodFactory.product.Pizza;
import methodFactory.creator.PizzaStore;
import methodFactory.concreteProduct.NYStyleCheesePizza;
import methodFactory.concreteProduct.NYStyleClamPizza;
import methodFactory.concreteProduct.NYStylePepperoniPizza;
import methodFactory.concreteProduct.NYStyleVeggiePizza;

/**
 * Created by XY on 2016/10/31.
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                return new NYStyleCheesePizza();
            case "veggie":
                return new NYStyleVeggiePizza();
            case "pepperoni":
                return new NYStylePepperoniPizza();
            case "clam":
                return new NYStyleClamPizza();
        }
        return pizza;
    }
}
