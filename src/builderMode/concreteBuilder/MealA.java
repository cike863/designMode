package builderMode.concreteBuilder;

import builderMode.builder.MealBuilder;

/**
 * Created by XY on 2016/11/13.
 */
public class MealA extends MealBuilder {
    @Override
    public void buildFood() {
        meal.setFood("一盒薯条");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("一杯可乐");
    }
}
