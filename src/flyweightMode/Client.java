package flyweightMode;

import flyweightMode.flyweight.Shape;
import flyweightMode.flyweightFactory.FlyweightFactory;

/**
 * Created by XY on 2016/11/20.
 */
public class Client {
    public static void main(String[] args) {
        Shape shape = FlyweightFactory.getShape("红色");
        shape.draw();
        Shape shape1 = FlyweightFactory.getShape("灰色");
        shape1.draw();
        Shape shape2 = FlyweightFactory.getShape("绿色");
        shape2.draw();

        Shape shape3 = FlyweightFactory.getShape("红色");
        shape3.draw();
        Shape shape4 = FlyweightFactory.getShape("灰色");
        shape4.draw();
        Shape shape5 = FlyweightFactory.getShape("绿色");
        shape5.draw();
        System.out.println("一共绘制了" + FlyweightFactory.getSum() + "中颜色的圆形");

    }
}
