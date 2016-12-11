package deckerMode.concreteComponent;

import deckerMode.component.Beverage;

/**
 * Created by XY on 2016/11/20.
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
