package deckerMode.concreteComponent;

import deckerMode.component.Beverage;

/**
 * Created by XY on 2016/11/20.
 */
public class Decat extends Beverage {
    public Decat() {
        description = "Decat";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
