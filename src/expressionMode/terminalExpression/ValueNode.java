package expressionMode.terminalExpression;

import expressionMode.abstractExpression.Node;

/**
 * Created by XY on 2016/11/27.
 */
public class ValueNode implements Node {
    private int value;

    public ValueNode(int value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        return this.value;
    }
}
