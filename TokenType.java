
/**
 * A program in a programming language is made up 
 * of different kinds of tokens.
 * This enumeration represents these different kinds.
 */ 
public enum  TokenType
{
    PLUS("addition"),
    MINUS("subtraction"),
    TIMES("multiplication"),
    DIV("division"),
    POW("raised to the power of"),
    MOD("modulo division"),
    OPEN_PAREN("open parenthesis"),
    CLOSED_PAREN("closed parenthesis"),
    EOF("end of file"),
    LITERAL("literal number"),
    IDENTIFIER("identifier");
    
    private final String name;
    
    /**
     * Initialize a TokenType.
     * @param name The human-readable name of this TokenType.
     */
    private TokenType(final String name) {
        this.name = name;
    }

    /**
     * Get the human-readable name.
     * @return the name of this TokenType.
     */
    public String getName() {
        return name;
    }
}

