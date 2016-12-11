package chainMode.concreteHandler;

import chainMode.LeaveNode;
import chainMode.handler.Leader;

/**
 * 校长
 * Created by XY on 2016/11/20.
 */
public class President extends Leader {
    public President(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveNode leaveNode) {
        if (leaveNode.getNumber() <= 15) {//小于15天校长审批
            System.out.println("校长" + name + "审批" + leaveNode.getPerson() + "同学的请假条，请假天数为" + leaveNode.getNumber() + "天。");
        } else {//否则到系主任
            System.out.println("请假天数超过15天，不批准");
        }
    }
}
