package adapter.adapter;

import adapter.adaptee.Bird;
import adapter.target.Robot;

/**
 * Created by XY on 2016/11/13.
 */
public class BirdAdapter implements Robot {
    Bird bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void cry() {
        bird.jiji();
    }

    @Override
    public void move() {
        bird.fly();
    }
}
