package expressionMode.terminalExpression;

import expressionMode.abstractExpression.Node;
import expressionMode.abstractExpression.SymbolNode;

/**
 * Created by XY on 2016/11/27.
 */
public class ModNode extends SymbolNode {
    public ModNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return super.left.interpret() % super.right.interpret();
    }
}
