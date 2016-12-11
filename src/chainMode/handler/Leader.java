package chainMode.handler;

import chainMode.LeaveNode;

/**
 * Created by XY on 2016/11/20.
 */
public abstract class Leader {
    //姓名
    public String name;
    //后继者
    protected Leader successor;

    public Leader(String name) {
        this.name = name;
    }

    public void setSuccessor(Leader successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(LeaveNode leaveNode);
}
