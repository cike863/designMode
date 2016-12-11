package facadeMode;

import facadeMode.facade.WatchTvSwtichFacade;
import facadeMode.subSystem.AirCondition;
import facadeMode.subSystem.Light;
import facadeMode.subSystem.Screen;
import facadeMode.subSystem.Television;

/**
 * Created by XY on 2016/11/20.
 */
public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        Television television = new Television();
        AirCondition airCondition = new AirCondition();
        Screen screen = new Screen();
        WatchTvSwtichFacade watchTvSwtichFacade = new WatchTvSwtichFacade(light, airCondition, television, screen);
        watchTvSwtichFacade.on();
        System.out.println("-----------------可以看电视了");
        watchTvSwtichFacade.off();
        System.out.println("-----------------可以看睡觉了");
    }
}
