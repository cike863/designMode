package singletonMode.singleton;

/**
 * Created by XY on 2016/11/13.
 */
public class StaticSingleton {
    //利用静态变量来记录Singleton的唯一实例
    //直接初始化静态变量，这样就可以确保线程安全了
    private static StaticSingleton uniqueInstance = new StaticSingleton();

    //构造器私有化，只有Singleton类内才可以调用构造器
    private StaticSingleton() {

    }

    public StaticSingleton getUniqueInstance() {
        return uniqueInstance;
    }

}
