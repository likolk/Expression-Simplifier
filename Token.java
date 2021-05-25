
/**
 * Write a description of class Token here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Token 
{
    // position of the token - immutable
    private final Position position;
    private final TokenType type;
    private final String string;
    
    
    public Token (TokenType type, Position position) {
        this.type = type;
        this.position = position;
        this.string = null;
    }
    
    public Token(Position position, TokenType type, String string) {
        this.position = position;
        this.type = type;
        this.string = string;
    }

    public Position getPosition() {
        return position;
    }

    public TokenType getType() {
        return type;
    }

    public String getString() {
        return string;
    }

    @Override
    public String toString() {
        return type.toString();
    }
}
    
     