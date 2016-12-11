package deckerMode.concreteDecorator;

import deckerMode.component.Beverage;
import deckerMode.decorator.CondimentDecorator;

/**
 * Created by XY on 2016/11/20.
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.3;
    }
}
