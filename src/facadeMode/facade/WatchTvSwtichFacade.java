package facadeMode.facade;

import facadeMode.subSystem.AirCondition;
import facadeMode.subSystem.Light;
import facadeMode.subSystem.Screen;
import facadeMode.subSystem.Television;

/**
 * Created by XY on 2016/11/20.
 */
public class WatchTvSwtichFacade {
    Light light;
    AirCondition airCondition;
    Television television;
    Screen screen;

    public WatchTvSwtichFacade(Light light, AirCondition airCondition, Television television, Screen screen) {
        this.light = light;
        this.airCondition = airCondition;
        this.television = television;
        this.screen = screen;
    }

    public void on() {
        light.on();//首先开灯
        airCondition.on();//然后开空调
        screen.down();//把荧幕降下来、
        television.on();//然后打开电视
    }

    public void off() {
        television.off();//首先关电视
        screen.up();//荧幕升上去
        airCondition.off();//关闭空调
        light.off();//最后关灯

    }
}
