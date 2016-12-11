package deckerMode;

import deckerMode.component.Beverage;
import deckerMode.concreteComponent.DarkRoast;
import deckerMode.concreteComponent.Espresso;
import deckerMode.concreteDecorator.Mocha;
import deckerMode.concreteDecorator.Whip;

/**
 * Created by XY on 2016/11/20.
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        //System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
        //beverage1 = new Milk(beverage1);
        //System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
    }
}
