package abstractFactory.abstractFactory;

import abstractFactory.abstractProduct.Pizza;

/**
 * Created by XY on 2016/11/13.
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    //* 创建pizza的方法交给子类去实现
    public abstract Pizza createPizza(String type);
}
