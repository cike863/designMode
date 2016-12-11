package simpleFactory.concreteProduct;

import simpleFactory.product.Pizza;

/**
 * Created by XY on 2016/10/30.
 */
public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("prepare Cheese ...");
    }

    @Override
    public void bake() {
        System.out.println("bake Cheese ...");
    }

    @Override
    public void cut() {
        System.out.println("cut Cheese ...");
    }

    @Override
    public void box() {
        System.out.println("box Cheese ...");
    }

}
