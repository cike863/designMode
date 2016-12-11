package methodFactory.concreteCreator;

import methodFactory.product.Pizza;
import methodFactory.creator.PizzaStore;
import methodFactory.concreteProduct.ChicagoStyleCheesePizza;
import methodFactory.concreteProduct.ChicagoStyleClamPizza;
import methodFactory.concreteProduct.ChicagoStylePepperoniPizza;
import methodFactory.concreteProduct.ChicagoStyleVeggiePizza;

/**
 * Created by XY on 2016/10/31.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equals(type)) {
            pizza = new ChicagoStyleCheesePizza();
        } else if ("clam".equals(type)) {
            pizza = new ChicagoStyleClamPizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new ChicagoStylePepperoniPizza();
        } else if ("veggie".equals(type)) {
            pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }
}
