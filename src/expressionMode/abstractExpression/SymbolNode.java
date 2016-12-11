package expressionMode.abstractExpression;

/**
 * Created by XY on 2016/11/27.
 */
public abstract class SymbolNode implements Node {
    protected Node left;
    protected Node right;

    public SymbolNode(Node left, Node right) {
        this.left = left;
        this.right = right;
    }
}
