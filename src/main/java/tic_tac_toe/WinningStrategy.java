package tic_tac_toe;

public interface WinningStrategy {
    boolean checkWin(PlayerSymbol[][] board, int[] row, int[] col, int diagonal1, int diagonal2, int totalmoves);
}
