package chainMode.concreteHandler;

import chainMode.LeaveNode;
import chainMode.handler.Leader;

/**
 * 院长
 * Created by XY on 2016/11/20.
 */
public class Dean extends Leader {
    public Dean(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveNode leaveNode) {
        if (leaveNode.getNumber() <= 10) {//小于7天院长审批
            System.out.println("院长" + name + "审批" + leaveNode.getPerson() + "同学的请假条，请假天数为" + leaveNode.getNumber() + "天。");
        } else {//否则到校长
            this.successor.handleRequest(leaveNode);
        }
    }
}
