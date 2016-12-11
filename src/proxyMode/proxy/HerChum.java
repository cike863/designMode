package proxyMode.proxy;

import proxyMode.realSubject.BeautifulGirl;
import proxyMode.realSubject.You;
import proxyMode.subject.GiveGift;

/**
 * Created by XY on 2016/11/20.
 */
public class HerChum implements GiveGift {
    You you;

    public HerChum(BeautifulGirl mm) {
        this.you = new You(mm);
    }

    @Override
    public void giveFlowers() {
        you.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        you.giveChocolate();
    }

    @Override
    public void giveBook() {
        you.giveBook();
    }
}
