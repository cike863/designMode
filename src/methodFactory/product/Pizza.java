package methodFactory.product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by XY on 2016/10/30.
 */
public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sause;
    protected List<String> toppings = new ArrayList<>();

    private void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Preparing " + dough);
        System.out.println("Preparing " + sause);
        for(int i = 0;i < toppings.size();i++){
            System.out.println("   "+toppings.get(i));
         }
    }

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }
    public void cut(){
        System.out.println("Cutting the concreteCreator into diagonal slices");
    }
    public void box(){
        System.out.println("Place concreteCreator in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
