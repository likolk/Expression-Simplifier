import java.util.Stack;
/**
 * Write a description of class validExpression here.
 *
 * @author (Kelvin Likollari)
 * @version (04.06.2021)
 */
public class validExpression
{
    
    /**
     * @param args the command line arguments
     */
 
    static boolean checkValid(char[] equ){
        
        int i,j = equ.length;
        Stack<Character> astack = new Stack<>();
        if (j==0) {
            return false;
        }

        for(i=0; i<j; i++){
                   // System.out.println("?"+equ[i]);
            if (isOpen(equ[i])){
                if (!astack.isEmpty() && isNumber(astack.peek())) {
                    return false;
                }
                astack.push(equ[i]);
            } else if (isNumber(equ[i])){
                astack.push(equ[i]);
            } else if (isOp(equ[i])){
                if (astack.isEmpty() || !isNumber(astack.peek())) {
                    return false;
                }
                astack.push(equ[i]);
            } else if (isClose(equ[i])){
                if (astack.isEmpty() || !isNumber(astack.peek())) {
                    return false;
                }
                while(!astack.isEmpty()){
                    char temp=astack.pop();
                    if (isOpen(temp)) {
                        if (doMatch(temp,equ[i])) {
                            break;
                        } else {
                            return false;//unexpected open
                        }
                    } else {
                        if(astack.isEmpty()) {
                            return false;
                        }
                    }
                }
                astack.push('1');
            } else { //unexpected char
                return false;
            }
        }
        if (!astack.isEmpty() && !isNumber(astack.peek())) {
            return false;
        }
        while (!astack.isEmpty()) {
            if(isOpen(astack.pop())) {
                return false;
            }
        }
         
        return true;
    }

    private static boolean isOpen(char c) {
        if(c == '(' || c== '[' ) {
            return true;
        }
        return false;
    }

    private static boolean isNumber(char c) {
        if((c >= '0' && c <= '9' ) || (c >= 'a' && c <= 'z' ) || (c >= 'A' && c <= 'Z' )) {
            return true;
        }
        return false;
    }

    private static boolean isOp(char c) {
        if (c == '+' || c == '-' || c == '*' || c == '/') {
            return true;
        }
        return false;
    }

    private static boolean isClose(char c) {
        if(c == ')' || c == ']') {
            return true;
        }
        return false;
    }

    private static boolean doMatch(char temp, char c) {
        if((temp == '(' && c == ')')||(temp == '[' && c == ']')) {
            return true;
        }
        return false;
    }
}
