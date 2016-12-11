package bridgeMode.concreteImplementor;

import bridgeMode.implementor.Color;

/**
 * Created by XY on 2016/11/13.
 */
public class White implements Color {

    @Override
    public void bepaint(String shape) {
        System.out.println("白色的" + shape);
    }
}
