package chainMode;

/**
 * Created by XY on 2016/11/20.
 */
public class LeaveNode {
    //时间天数
    private int number;
    //请假人
    private String person;

    public LeaveNode(int number, String person) {
        this.number = number;
        this.person = person;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }
}
