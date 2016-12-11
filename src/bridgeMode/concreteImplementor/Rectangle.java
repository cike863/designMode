package bridgeMode.concreteImplementor;

import bridgeMode.abstraction.Shape;

/**
 * Created by XY on 2016/11/13.
 */
public class Rectangle extends Shape {
    @Override
    public void draw() {
        color.bepaint("长方形");
    }
}
