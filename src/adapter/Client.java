package adapter;

import adapter.adaptee.Bird;
import adapter.adaptee.Dog;
import adapter.adapter.BirdAdapter;
import adapter.adapter.DogAdapter;
import adapter.client.BioRobot;
import adapter.target.Robot;

/**
 * Created by XY on 2016/11/13.
 */
public class Client {
    public static void main(String[] args) {
        BioRobot robot = new BioRobot();        //首先我们需要一个机器人 4
        Dog dog = new Dog();         //和一只狗
        //将这只狗包装到机器人中，使其有点儿像机器人 7
        Robot dogRobot = new DogAdapter(dog);
        //然后是机器人叫和跑10
        System.out.println("BioRob cry.....");
        dogRobot.cry();
        dogRobot.move();

        Bird bird = new Bird();
        Robot birdRobot = new BirdAdapter(bird);
        System.out.println("birdRobot cry.....");
        birdRobot.cry();
        birdRobot.move();


    }
}
