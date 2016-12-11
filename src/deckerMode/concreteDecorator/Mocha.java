package deckerMode.concreteDecorator;

import deckerMode.component.Beverage;
import deckerMode.decorator.CondimentDecorator;

/**
 * Created by XY on 2016/11/20.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.2;
    }
}
