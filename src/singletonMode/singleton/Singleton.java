package singletonMode.singleton;

/**
 * Created by XY on 2016/11/13.
 */
public class Singleton {
    ///利用静态变量来记录Singleton的唯一实例
    private static Singleton uniqueInstance;

    //* 构造器私有化，只有Singleton类内才可以调用构造器
    private Singleton() {

    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
