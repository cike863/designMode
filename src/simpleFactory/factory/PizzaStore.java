package simpleFactory.factory;

import simpleFactory.product.Pizza;

/**
 * Created by XY on 2016/10/30.
 */
public class PizzaStore {
    //SimplePizzaFactory的引用
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;

    }
    public Pizza orderPizza(String type){
        Pizza pizza;
        //使用工厂对象的创建方法，而不是直接new。这里不再使用具体实例化
        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.box();
        pizza.cut();
        return  pizza;

    }

}
