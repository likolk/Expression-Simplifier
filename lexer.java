import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
/**
 * Write a description of class lexer here.
 * @author (Kelvin Likollari)
 * @version (a version number or a date)
 */
public class Lexer {
    public static final int err = 0,
    num = 1,
    id = 2,
    plus = 3,
    minus = 4,
    times = 5,
    div = 6,
    mod = 7,
    lp = 8,
    rp = 9,
    semico = 10,
    where = 11,
    and = 12,
    eq = 13;
    
    private int token;
    private char idval;
    private int numval;
    private String line = "";
    private BufferedReader buf;
    
    public Lexer() {
        buf = new BufferedReader(new InputStreamReader(System.in));
    }
    
    public Lexer(String s) {
        buf = new BufferedReader(new StringReader(s));
    }
    
    public void init() {
        do {
            try {
                line = buf.readLine().trim();
                if (!line.endsWith(";")) {
                    line = String.format("%s;", line);
                }
            }
                catch (Exception e) 
                {
                    System.out.println("Yooo, this is a wrong input");
                    System.exit(1);
                }
            }
            while (line.length() == 0);
    }
}