package deckerMode.concreteComponent;

import deckerMode.component.Beverage;

/**
 * Created by XY on 2016/11/20.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
