package deckerMode.concreteDecorator;

import deckerMode.component.Beverage;
import deckerMode.decorator.CondimentDecorator;

/**
 * Created by XY on 2016/11/20.
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
