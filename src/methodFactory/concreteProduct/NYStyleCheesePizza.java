package methodFactory.concreteProduct;

import methodFactory.product.Pizza;

/**
 * Created by XY on 2016/10/31.
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza(){
        name = "Ny Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sause = "Marinara Sauce";
        toppings.add("Crated Reggiano Cheese");
    }
}
