package proxyMode.realSubject;

import proxyMode.subject.GiveGift;

/**
 * Created by XY on 2016/11/20.
 */
public class You implements GiveGift {
    BeautifulGirl mm;

    public You(BeautifulGirl mm) {
        this.mm = mm;
    }

    @Override
    public void giveFlowers() {
        System.out.println(mm.getName() + ",送你一束花。。。");
    }

    @Override
    public void giveChocolate() {
        System.out.println(mm.getName() + ",送你一盒巧克力。。。");
    }

    @Override
    public void giveBook() {
        System.out.println(mm.getName() + ",送你一本书。。。");
    }
}
