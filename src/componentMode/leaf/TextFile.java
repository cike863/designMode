package componentMode.leaf;

import componentMode.component.File;

/**
 * Created by XY on 2016/11/13.
 */
public class TextFile extends File {
    public TextFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("这是文本文件，文件名：" + super.getName());
    }
}
