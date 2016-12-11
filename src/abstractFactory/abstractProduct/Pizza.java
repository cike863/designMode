package abstractFactory.abstractProduct;

import abstractFactory.bean.*;

/**
 * Created by XY on 2016/11/13.
 */
public abstract class Pizza {
    public String name;
    public Dough dough;
    public Sauce sauce;
    public Veggies[] veggies;
    public Cheese cheese;
    public Pepperoni pepperoni;
    public Clams clams;

    //* prepare()方法声明为抽象方法。在这个方法中，我们需要收集披萨所需要的原料，而这些原料都是来自原料工厂
    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 munites at 350");
    }

    public void cut() {
        System.out.println("Cutting the concreteCreator into diagonal slices");
    }

    public void box() {
        System.out.println("Place concreteCreator in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
