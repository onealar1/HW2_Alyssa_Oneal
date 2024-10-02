import cs3331Helper.cs3331TicTacToeBoard;
import cs3331Helper.cs3331TicTacToeController;
import cs3331Helper.cs3331TicTacToeGame;
import cs3331Helper.cs3331TicTacToeSquare;
import javafx.scene.paint.Color;

/**
 * MyTicTacToe
 */
public class MyTicTacToe implements cs3331TicTacToeGame{

    private cs3331TicTacToeBoard board = new cs3331TicTacToeBoard();
    private cs3331TicTacToeController controller = new cs3331TicTacToeController();
    private cs3331TicTacToeSquare square = new cs3331TicTacToeSquare();
    private Players player1 = new Players("X");
    private Players player2 = new Players("O");
    

    public MyTicTacToe() {
        controller.setControllerMessage("Select a square to start playing!");
        controller.addPlayer(player1);
        controller.addPlayer(player2);
    }


    @Override
    public void invalidSquareChosen(int row, int column) {
        square.flashColor(Color.RED);
        controller.setControllerMessage("Select a different square.");
    }

    @Override
    public void noWinner() {
        controller.setControllerMessage("No one wins. Try again!");
        restartGame();
    }

    @Override
    public void playerWins() {
        board.highlightWinningSquares(Color.GREEN);
        controller.setControllerMessage("Congratulations " + controller.getWinningPlayer() + ", you are the winner!!");
        restartGame();
    }

    @Override
    public void restartGame() {
        board.clearSymbols();
        board.clearHighlights();
        controller.playAgain();
        controller.setControllerMessage("Select a square to start playing!");
    }

}
