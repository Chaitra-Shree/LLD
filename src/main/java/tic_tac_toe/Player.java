package tic_tac_toe;

public class Player {
    PlayerSymbol playerSymbol;

    public PlayerSymbol getPlayerSymbol() {
        return playerSymbol;
    }

    public void setPlayerSymbol(PlayerSymbol playerSymbol) {
        this.playerSymbol = playerSymbol;
    }
    public Player(PlayerSymbol playerSymbol) {
        this.playerSymbol = playerSymbol;
    }
}
