package methodFactory.creator;

import methodFactory.product.Pizza;

/**
 * Created by XY on 2016/10/31.
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.box();
        pizza.bake();
        pizza.cut();
        return pizza;
    }

    //创建pizza的方法交给子类去实现
    public abstract Pizza createPizza(String type);
}
