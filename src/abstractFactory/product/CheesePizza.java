package abstractFactory.product;

import abstractFactory.concreteFactory.PizzaIngredientFactory;
import abstractFactory.abstractProduct.Pizza;

/**
 * Created by XY on 2016/11/13.
 */
public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        prepare();
    }

    @Override
    public void prepare() {
        System.out.println("Prepareing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
