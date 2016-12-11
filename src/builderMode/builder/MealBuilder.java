package builderMode.builder;

import builderMode.product.Meal;

/**
 * Created by XY on 2016/11/13.
 */
public abstract class MealBuilder {
    public Meal meal = new Meal();

    public abstract void buildFood();

    public abstract void buildDrink();

    public Meal getMeal() {
        return meal;
    }
}
