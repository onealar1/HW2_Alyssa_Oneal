import cs3331Helper.cs3331TicTacToeBoard;
import cs3331Helper.cs3331TicTacToeController;
import cs3331Helper.cs3331TicTacToeGame;
import javafx.scene.paint.Color;

/**
 * MyTicTacToe
 */
public class MyTicTacToe implements cs3331TicTacToeGame{

    // package private static objects for the board and the controller - Players is able to use them, but anything outside the package is not
    static cs3331TicTacToeBoard board = new cs3331TicTacToeBoard();
    static cs3331TicTacToeController controller = new cs3331TicTacToeController();

    // 2 player objects that will play the game together
    private Players player1 = new Players("X");
    private Players player2 = new Players("O");
    

    // contructor for the game - a message will show when the game is created, and only 2 players will be allowed in the game
    public MyTicTacToe() {
        controller.setControllerMessage("Select a square to start playing!");
        controller.addPlayer(player1);
        controller.addPlayer(player2);
    }


    // When a player tries to pick a square that is not 
    @Override
    public void invalidSquareChosen(int row, int column) {
        board.squareAt(row, column).flashColor(Color.RED);
        controller.setControllerMessage("Square chosen has already been taken. Try again.");
    }

    @Override
    public void noWinner() {
        controller.setControllerMessage("Its a tie. Try again!");
    }

    @Override
    public void playerWins() {
        board.highlightWinningSquares(Color.GREEN);
        controller.setControllerMessage("Congratulations " + controller.getWinningPlayer() + ", you are the winner!!");
    }

    @Override
    public void restartGame() {
        board.clearSymbols();
        board.clearHighlights();
        controller.playAgain();
        controller.setControllerMessage("Select a square to start playing.");
    }

}
