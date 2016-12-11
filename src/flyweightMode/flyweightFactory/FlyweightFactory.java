package flyweightMode.flyweightFactory;

import flyweightMode.concreteFlyweight.Circle;
import flyweightMode.flyweight.Shape;

import java.util.HashMap;

/**
 * Created by XY on 2016/11/20.
 */
public class FlyweightFactory {
    private static HashMap<String, Shape> shapes = new HashMap();

    public static Shape getShape(String key) {
        Shape shape = shapes.get(key);
        if (shape == null) {
            shape = new Circle(key);
            shapes.put(key, shape);
        }
        return shape;

    }

    public static int getSum() {
        return shapes.size();
    }
}
