package deckerMode.concreteDecorator;

import deckerMode.component.Beverage;
import deckerMode.decorator.CondimentDecorator;

/**
 * Created by XY on 2016/11/20.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
