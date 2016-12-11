package adapter.adapter;

import adapter.adaptee.Dog;
import adapter.target.Robot;

/**
 * Created by XY on 2016/11/13.
 */
public class DogAdapter implements Robot {
    Dog dog;

    ////取得要适配的对象的引用
    public DogAdapter(Dog dog) {
        this.dog = dog;
    }
    //实现接口中的方法，只需要在相应的方法间进行转换即可完成。
    @Override
    public void cry() {
        System.out.println("机器人模拟狗叫...");
        dog.wang();
    }

    @Override
    public void move() {
        System.out.println("机器人模拟狗跑...");
        dog.run();
    }
}
