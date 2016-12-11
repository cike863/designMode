package chainMode.concreteHandler;

import chainMode.LeaveNode;
import chainMode.handler.Leader;

/**
 * 系主任
 * Created by XY on 2016/11/20.
 */
public class DepartmentHead extends Leader {
    public DepartmentHead(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveNode leaveNode) {
        if (leaveNode.getNumber() <= 7) {//小于7天系主任审批
            System.out.println("系主任" + name + "审批" + leaveNode.getPerson() + "同学的请假条，请假天数为" + leaveNode.getNumber() + "天。");
        } else {//否则到院长
            this.successor.handleRequest(leaveNode);
        }
    }
}
