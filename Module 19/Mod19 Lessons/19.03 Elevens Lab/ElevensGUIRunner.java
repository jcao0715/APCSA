/**
 * This is a class that plays the GUI version of the Elevens game.
 * See accompanying documents for a description of how Elevens is played.
 *
 * Run this program to test the Board and Elevens Board classes. No edits needed.
 * If successful, you can play the Elevens Game!
 */
public class ElevensGUIRunner {

   /**
    * Plays the GUI version of Elevens.
    * @param args is not used.
    */
   public static void main(String[] args) {
      Board board = new ElevensBoard();
      CardGameGUI gui = new CardGameGUI(board);
      gui.displayGame();
   }
}