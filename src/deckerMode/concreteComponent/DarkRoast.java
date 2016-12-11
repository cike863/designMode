package deckerMode.concreteComponent;

import deckerMode.component.Beverage;

/**
 * Created by XY on 2016/11/20.
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
