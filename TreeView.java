import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class TreeView extends JPanel  {
    // Class for drawing the Tree onto a panel
    private int radius = 20;
    private int levelGap = 50;
    
    ExpTree t;

    public TreeView(ExpTree t) {
        this.t = t;
    }

    protected void paintComponent(Graphics g) {
        g.setColor(Color.blue);
        g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 11));

        if (t.getRoot() != null) {
            displayTree(g, t.getRoot(), getWidth() / 2, 30, getWidth() / 4);
        }
    }

    private void displayTree(Graphics g, ExpTree t, int x, int y, int gap) {
        g.drawString(getText(String.valueOf(t.getLeafVal())), x - 20, y - 22);
        //   g.drawRect(x - radius, y - radius, 2 * radius, 2 * 10);
        g.drawRoundRect(x - radius, y - radius, 2 * radius, 2 * 10, 10, 10);
        //  g.fillRoundRect(x - radius, y - radius, 2 * radius, 2 * 10, 10, 10);
        g.drawString(t.getLeafVal() + "", x - 2, y - 5);
        
        if (t.getrChild() != null) {
            displayTree(g, t.rChild, x + gap, y + levelGap, gap /2);
            connectRect(g, x + gap, y + levelGap, x, y);
        }
        
        if (t.getlChild() != null) {
            connectRect(g,  x - gap , y + levelGap,  x, y);
            displayTree(g, t.lChild, x - gap, y + levelGap, gap /2);
        }
    }
    
    private void connectRect(Graphics g, int x1, int y1, int x2, int y2) {
        g.drawLine(x1 - 20, y1 - 20, x2, y2);
    }
    
    public String getText(String op) {
        char c = op.charAt(0);
        String res  = null;
        if(c == '+') {
            res= "Addition";
        }
        else if (c == '-') {
            res = "Subtraction";
        } else if (c == '*') {
            res = "Multiplication";
        } else if (c == '/') {
            res = "Division";
        } else if ((c >= '0' && c <= '9' ) || (c >= 'a' && c <= 'z' ) || (c >= 'A' && c <= 'Z' )) {
               res = "Literal";
            }
            return res;
        }
}