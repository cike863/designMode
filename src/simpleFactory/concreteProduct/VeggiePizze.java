package simpleFactory.concreteProduct;

import simpleFactory.product.Pizza;

/**
 * Created by XY on 2016/10/30.
 */
public class VeggiePizze extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare VeggiePizze ...");
    }

    @Override
    public void bake() {
        System.out.println("bake VeggiePizze ...");
    }

    @Override
    public void cut() {
        System.out.println("cut VeggiePizze ...");
    }

    @Override
    public void box() {
        System.out.println("box VeggiePizze ...");
    }
}
