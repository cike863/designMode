package chainMode.concreteHandler;

import chainMode.LeaveNode;
import chainMode.handler.Leader;

/**
 * 辅导员
 * Created by XY on 2016/11/20.
 */
public class Instructor extends Leader {
    public Instructor(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveNode leaveNode) {
        if (leaveNode.getNumber() <= 3) {//小于3天辅导员审批
            System.out.println("辅导员" + name + "审批" + leaveNode.getPerson() + "同学的请假条，请假天数为" + leaveNode.getNumber() + "天。");
        } else {//否则到系主任
            this.successor.handleRequest(leaveNode);
        }
    }
}
