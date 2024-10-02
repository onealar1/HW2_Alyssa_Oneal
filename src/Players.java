import cs3331Helper.cs3331TicTacToePlayer;
import cs3331Helper.cs3331TicTacToeSquare;

public class Players implements cs3331TicTacToePlayer{

    private String playerIcon;
    private cs3331TicTacToeSquare square = new cs3331TicTacToeSquare();

    public Players(String playerIcon) {
        this.playerIcon = playerIcon;
    }

    @Override
    public void selectSquare(int row, int column) {
        square.markSquare(playerIcon);
    }
    
}
