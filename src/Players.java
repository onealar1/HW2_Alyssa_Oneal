import cs3331Helper.cs3331TicTacToePlayer;
import cs3331Helper.cs3331TicTacToeSquare;
import cs3331Helper.cs3331TicTacToeController;

public class Players implements cs3331TicTacToePlayer{

    private String playerIcon;

    public Players(String playerIcon) {
        this.playerIcon = playerIcon;
    }

    @Override
    public void selectSquare(int row, int column) {
        cs3331TicTacToeSquare square = new cs3331TicTacToeSquare();
        cs3331TicTacToeController controller = new cs3331TicTacToeController();
        square.markSquare(playerIcon);
        controller.finishedTurn();
    }
    
}
