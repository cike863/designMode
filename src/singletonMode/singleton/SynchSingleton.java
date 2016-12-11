package singletonMode.singleton;

/**
 * Created by XY on 2016/11/13.
 */
public class SynchSingleton {
    //利用静态变量来记录Singleton的唯一实例
    private static SynchSingleton uniqueInstance;
    //构造器私有化，只有Singleton类内才可以调用构造器
    private SynchSingleton() {

    }

    public static synchronized SynchSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SynchSingleton();
        }
        return uniqueInstance;
    }
}
