package bridgeMode.refinedAbstraction;

import bridgeMode.implementor.Color;

/**
 * Created by XY on 2016/11/13.
 */
public class Gray implements Color {
    @Override
    public void bepaint(String shape) {
        System.out.println("灰色的" + shape);
    }
}
