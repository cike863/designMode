package bridgeMode;

import bridgeMode.abstraction.Shape;
import bridgeMode.concreteImplementor.Rectangle;
import bridgeMode.concreteImplementor.Square;
import bridgeMode.concreteImplementor.White;
import bridgeMode.implementor.Color;
import bridgeMode.refinedAbstraction.Circle;

/**
 * Created by XY on 2016/11/13.
 */
public class Client {
    public static void main(String[] args) {
        //白色
        Color white = new White();
        //正方形
        Shape square = new Square();
        //白色的正方形
        square.setColor(white);
        square.draw();

        //长方形
        Shape rectange = new Rectangle();
        rectange.setColor(white);
        rectange.draw();

        // 圆形
        Shape circle = new Circle();
        circle.setColor(white);
        circle.draw();
    }
}
