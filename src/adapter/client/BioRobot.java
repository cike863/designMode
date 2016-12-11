package adapter.client;

import adapter.target.Robot;

/**
 * Created by XY on 2016/11/13.
 */
public class BioRobot implements Robot {
    @Override
    public void cry() {
        System.out.println("仿生机器人叫.....");
    }

    @Override
    public void move() {
        System.out.println("仿生机器人慢慢移动....");
    }
}
