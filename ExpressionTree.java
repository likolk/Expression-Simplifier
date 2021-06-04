

// ExpressionTree class
public class ExpressionTree {    
    //Tree object that is created when an expression is parsed
    private int type;
    private Object leafvalue;
    public ExpressionTree leftChild, rightChild;
    public static final int NUM = 0;
    public static final int value = 1;
    public static final int OP = 2;
    // OR shorthand public static final int NUM = 0, valueue = 1, OP = 2;
    private StringBuffer stringBuffer = new StringBuffer();

    public ExpressionTree(int type, Object leafvalue, ExpressionTree l, ExpressionTree r) {
        this.type = type;
        this.leafvalue = leafvalue;
        this.leftChild = l;
        this.rightChild = r;
    }
    //return the forth expression, a postfix expression
    public String toPostfix(ExpressionTree t) {
       if (t != null) {
           toPostfix(t.leftChild);
            toPostfix(t.rightChild);
            stringBuffer.append(t.leafvalue);
            stringBuffer.append(" ");
        }
        return stringBuffer.toString();
    }

    public ExpressionTree getRoot() {
        return this;
    }
    
    public Object getLeafvalueue() {
        return leafvalue;
    }

    public ExpressionTree getleftChild() {
        return leftChild;
    }
    
    public ExpressionTree getrightChild() {
        return rightChild;
    }
}