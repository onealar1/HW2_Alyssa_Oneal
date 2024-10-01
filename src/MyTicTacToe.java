import cs3331Helper.cs3331TicTacToeBoard;
import cs3331Helper.cs3331TicTacToeController;
import cs3331Helper.cs3331TicTacToeGame;

/**
 * MyTicTacToe
 */
public class MyTicTacToe implements cs3331TicTacToeGame{

    private cs3331TicTacToeBoard board = new cs3331TicTacToeBoard();
    private cs3331TicTacToeController controller = new cs3331TicTacToeController();

    public MyTicTacToe() {
        controller.setControllerMessage("Select a square to start playing!");
    }


    @Override
    public void invalidSquareChosen(int arg0, int arg1) {
    }

    @Override
    public void noWinner() {
    }

    @Override
    public void playerWins() {
    }

    @Override
    public void restartGame() {
    }

    

}
