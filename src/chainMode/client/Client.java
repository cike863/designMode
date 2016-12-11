package chainMode.client;

import chainMode.LeaveNode;
import chainMode.concreteHandler.Dean;
import chainMode.concreteHandler.DepartmentHead;
import chainMode.concreteHandler.Instructor;
import chainMode.concreteHandler.President;
import chainMode.handler.Leader;

/**
 * Created by XY on 2016/11/20.
 */
public class Client {
    public static void main(String[] args) {
        Leader instructor = new Instructor("陈毅");//辅导员
        Leader departmentHead = new DepartmentHead("王明");//系主任
        Leader dean = new Dean("张强");//院长
        Leader president = new President("汪涵");//校长
        instructor.setSuccessor(departmentHead);
        departmentHead.setSuccessor(dean);
        dean.setSuccessor(president);
        //请假3天
        LeaveNode leaveNode = new LeaveNode(3, "66");
        instructor.handleRequest(leaveNode);

        //请假9天
        LeaveNode leaveNode1 = new LeaveNode(9, "661");
        instructor.handleRequest(leaveNode1);


        //请假15天
        LeaveNode leaveNode2 = new LeaveNode(15, "662");
        instructor.handleRequest(leaveNode2);

        //请假20天
        LeaveNode leaveNode3 = new LeaveNode(20, "663");
        instructor.handleRequest(leaveNode3);



    }


}
