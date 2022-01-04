/*
 * Jaimie Lee
 * Period 4 AP Computer Science
 * Due March 26, 2019
 */

package elevenslabjl;

/**
 *
 * @author mslee
 */
public class ElevensGUIRunner {

    public static void main(String[] args) {
        Board board = new ElevensBoard();
        CardGameGUI gui = new CardGameGUI(board);
        gui.displayGame();
    }
}