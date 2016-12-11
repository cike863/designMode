package bridgeMode.refinedAbstraction;


import bridgeMode.abstraction.Shape;

/**
 * Created by XY on 2016/11/13.
 */
public class Circle extends Shape {
    @Override
    public void draw() {
        color.bepaint("圆形");
    }
}
