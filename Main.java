/**
 * This class contains the main method that is the entry point where the expression
 * simplifier application starts executing. The main method creates the model, then 
 * creates the User Interface by passing the model to the UI, so that the UI will know
 * the model, and lastly makes the User Interface visible.
 */
public class Main {
    
    /**
     * Run the application (from the command line).
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        final Model model = new Model();
        final TextUserInterface TUI = new TextUserInterface(model);
        TUI.run();
        // also may print a welcome message of the game
        
        // also may print a good bye message of the game.
    }
    
    
}