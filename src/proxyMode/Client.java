package proxyMode;

import proxyMode.proxy.HerChum;
import proxyMode.realSubject.BeautifulGirl;

/**
 * Created by XY on 2016/11/20.
 */
public class Client {
    public static void main(String[] args){
        BeautifulGirl beautifulGirl = new BeautifulGirl("66");
        HerChum herChum = new HerChum(beautifulGirl);
        herChum.giveBook();
        herChum.giveChocolate();
        herChum.giveFlowers();

    }
}
