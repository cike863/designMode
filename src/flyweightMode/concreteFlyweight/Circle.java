package flyweightMode.concreteFlyweight;

import flyweightMode.flyweight.Shape;

/**
 * Created by XY on 2016/11/20.
 */
public class Circle implements Shape {
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("画了一个" + color + "的圆形");
    }
}
