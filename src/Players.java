import cs3331Helper.cs3331TicTacToePlayer;
public class Players implements cs3331TicTacToePlayer{

    private String playerIcon;

    public Players(String playerIcon) {
        this.playerIcon = playerIcon;
    }

    @Override
    public void selectSquare(int row, int column) {
        MyTicTacToe.board.squareAt(row, column).markSquare(playerIcon);
        MyTicTacToe.controller.setControllerMessage("Player " + this.playerIcon + " finished their turn.");
        MyTicTacToe.controller.finishedTurn();
    }
    
}
