package simpleFactory.concreteProduct;

import simpleFactory.product.Pizza;

/**
 * Created by XY on 2016/10/30.
 */
public class ClamPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare ClamPizza ...");
    }

    @Override
    public void bake() {
        System.out.println("bake ClamPizza ...");
    }

    @Override
    public void cut() {
        System.out.println("cut ClamPizza ...");
    }

    @Override
    public void box() {
        System.out.println("box ClamPizza ...");
    }
}
