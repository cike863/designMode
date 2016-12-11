package expressionMode.terminalExpression;

import expressionMode.abstractExpression.Node;
import expressionMode.abstractExpression.SymbolNode;

/**
 * Created by XY on 2016/11/27.
 */
public class MulNode extends SymbolNode {
    public MulNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return left.interpret() * right.interpret();
    }
}
