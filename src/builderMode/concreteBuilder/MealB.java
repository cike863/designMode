package builderMode.concreteBuilder;

import builderMode.builder.MealBuilder;

/**
 * Created by XY on 2016/11/13.
 */
public class MealB extends MealBuilder {
    @Override
    public void buildFood() {
        meal.setFood("三个鸡翅");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("一杯柠檬果汁");
    }
}
