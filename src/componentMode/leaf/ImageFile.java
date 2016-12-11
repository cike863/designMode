package componentMode.leaf;

import componentMode.component.File;

/**
 * Created by XY on 2016/11/13.
 */
public class ImageFile extends File {
    public ImageFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("这是图像文件，文件名：" + super.getName());
    }
}
