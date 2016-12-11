package simpleFactory.product;

/**
 * 抽象pizza类
 * Created by XY on 2016/10/30.
 */
public abstract class Pizza {
    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();
}
