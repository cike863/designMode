package bridgeMode.refinedAbstraction;

import bridgeMode.implementor.Color;

/**
 * Created by XY on 2016/11/13.
 */
public class Black implements Color {
    @Override
    public void bepaint(String shape) {
        System.out.println("黑色的" + shape);
    }
}
