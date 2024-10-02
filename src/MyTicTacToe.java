import cs3331Helper.cs3331TicTacToeBoard;
import cs3331Helper.cs3331TicTacToeController;
import cs3331Helper.cs3331TicTacToeGame;
import cs3331Helper.cs3331TicTacToePlayer;
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

    // When a player tries to pick a square that already has a mark in it, the square will highlight red, and a message will 
    // show up letting the user know they need to pick a new square
    @Override
    public void invalidSquareChosen(int row, int column) {
        board.squareAt(row, column).flashColor(Color.RED);
        controller.setControllerMessage("Square chosen has already been taken. Try again.");
    }

    // when there is a tie in the game, a message will show up letting the players know they need to start over
    @Override
    public void noWinner() {
        controller.setControllerMessage("Its a tie. Try again!");
    }

    // when a player wins, the 3 winning squares will highlight green, and a message will tell the players who won
    @Override
    public void playerWins() {
        cs3331TicTacToePlayer winningPlayer = controller.getWinningPlayer();
        String winningPlayerIcon = "";

        if(winningPlayer instanceof Players) {
            winningPlayerIcon = ((Players) winningPlayer).getPlayerIcon();
        }

        board.highlightWinningSquares(Color.GREEN);
        controller.setControllerMessage("Player " + winningPlayerIcon + " is the winner!!");
    }
    
    // when the restart button is clicked, all marks and higlights are removed, and the original message is showed on the screen
    @Override
    public void restartGame() {
        board.clearSymbols();
        board.clearHighlights();
        controller.playAgain();
        controller.setControllerMessage("Select a square to start playing.");
    }

}
