package componentMode.leaf;

import componentMode.component.File;

/**
 * Created by XY on 2016/11/13.
 */
public class VideoFile extends File {
    public VideoFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("这是影像文件，文件名：" + super.getName());
    }
}
