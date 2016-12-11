package bridgeMode.abstraction;

import bridgeMode.implementor.Color;

/**
 * Created by XY on 2016/11/13.
 */
public abstract class Shape {
    public Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
