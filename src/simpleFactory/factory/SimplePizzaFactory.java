package simpleFactory.factory;

import simpleFactory.concreteProduct.CheesePizza;
import simpleFactory.concreteProduct.PepperoniPizza;
import simpleFactory.product.Pizza;
import simpleFactory.concreteProduct.VeggiePizze;

/**
 * Created by XY on 2016/10/30.
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;
        switch (type){
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "clam":
                pizza = new CheesePizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            default:pizza = new VeggiePizze();
        }
        return  pizza;
    }
}
