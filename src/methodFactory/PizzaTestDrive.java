package methodFactory;

import methodFactory.concreteCreator.ChicagoPizzaStore;
import methodFactory.concreteCreator.NYPizzaStore;
import methodFactory.product.Pizza;

/**
 * Created by XY on 2016/11/13.
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        System.out.println("---------Joel 需要的芝加哥的深盘披萨---------");
        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();       //建立芝加哥的披萨店 5
        Pizza joelPizza = chicagoPizzaStore.orderPizza("cheese");             //下订单 6         System.out.println("Joel ordered a " + joelPizza.getName() + "\n");

        System.out.println("---------Ethan 需要的纽约风味的披萨---------");
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza ethanPizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + ethanPizza.getName() + "\n");
    }
}
