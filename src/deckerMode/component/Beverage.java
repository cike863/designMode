package deckerMode.component;

/**
 * Created by XY on 2016/11/20.
 */
public abstract class Beverage {
    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
