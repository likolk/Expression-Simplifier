public class ExpTree {
    

    //Tree object that is created when an expression is parsed
    private int type;
    
    private Object leafVal;
    
    public ExpTree lChild, rChild;
    
    public static final int NUM = 0, VAL = 1, OP = 2;
    
    private StringBuffer sb = new StringBuffer();

    public ExpTree(int type, Object leafVal, ExpTree l, ExpTree r) {
        this.type = type;
        this.leafVal = leafVal;
        this.lChild = l;
        this.rChild = r;
    }
    
       //return the forth expression, a postfix expression
       
    public String toPostfix(ExpTree t) {
        if (t != null) {
            toPostfix(t.lChild);
            toPostfix(t.rChild);
            sb.append(t.leafVal);
            sb.append(" ");
        }
        return sb.toString();
    }

    public ExpTree getRoot() {
        return this;
    }
    
    public Object getLeafVal() {
        return leafVal;
    }
    
    public ExpTree getlChild() {
        return lChild;
    }
    
    public ExpTree getrChild() {
        return rChild;
    }
}
