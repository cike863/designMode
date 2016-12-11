package componentMode.component;

/**
 * Created by XY on 2016/11/13.
 */
public abstract class File {
    String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void display();
}
