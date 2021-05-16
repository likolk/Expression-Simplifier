
/**
 * Write a description of class ExpressionSimplifierGam here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExpressionSimplifierGame
{ 
    // the person that is going to type in the input formula
    private User[] player;
    private ExpressionWindow expression;
    private User user;
    private int x;
    private int y;
    
    /**
     * Constructor
     * 
     */
    public ExpressionSimplifierGame() {
        //
    }
    
    /**
     * The method can allow to move the piece.
     * @param userMove indicate.
     */
    public static void quitGame(final String userAction) { 
       // Given a key press, close the game.
       // use q for Quit.
       if ("q".equals(userAction)) { 
           System.exit(0);
        }       
    }
}
