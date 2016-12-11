package expressionMode.context;

import expressionMode.abstractExpression.Node;
import expressionMode.terminalExpression.DivNode;
import expressionMode.terminalExpression.ModNode;
import expressionMode.terminalExpression.MulNode;
import expressionMode.terminalExpression.ValueNode;

import java.util.Stack;

/**
 * Created by XY on 2016/11/27.
 */
public class Calculator {
    private String statement;
    private Node node;

    public void bulid(String statement) {
        Node left = null, right = null;
        Stack stack = new Stack();
        String[] statementArr = statement.split(" ");
        for (int i = 0, length = statementArr.length; i < length; i++) {
            if (statementArr[i].equalsIgnoreCase("*")) {
                left = (Node) stack.pop();
                int value = Integer.parseInt(statementArr[++i]);
                right = new ValueNode(value);
                stack.push(new MulNode(left, right));
            } else if (statementArr[i].equalsIgnoreCase("/")) {
                left = (Node) stack.pop();
                int value = Integer.parseInt(statementArr[++i]);
                right = new ValueNode(value);
                stack.push(new DivNode(left, right));
            } else if (statementArr[i].equalsIgnoreCase("%")) {
                left = (Node) stack.pop();
                int value = Integer.parseInt(statementArr[++i]);
                right = new ValueNode(value);
                stack.push(new ModNode(left, right));
            } else {
                stack.push(new ValueNode(Integer.parseInt(statementArr[i])));
            }
        }
        this.node = (Node) stack.pop();
    }

    public int compute() {
        return node.interpret();
    }
}
