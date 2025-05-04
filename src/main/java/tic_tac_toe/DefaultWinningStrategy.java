package tic_tac_toe;

public class DefaultWinningStrategy implements WinningStrategy {

    @Override
    public boolean checkWin(PlayerSymbol[][] board, int[] row, int[] col, int dia1, int dia2, int totalMoves) {
        int n = board.length;
        if(dia1 == n || dia2 == n) {
            System.out.println("Player 1 wins");
            return true;
        }
        else if(dia1 == -n || dia2 == -n) {
            System.out.println("Player 2 wins");
            return true;
        }

        for(int i = 0 ; i < n ; i++) {
            if(row[i] == -n || col[i] == -n) {
                System.out.println("Player 1 wins");
                return true;
            }
            else if(row[i] == n || col[i] == n) {
                System.out.println("Player 2 wins");
                return true;
            }
        }

        if(totalMoves == n*n) {
            System.out.println("Tie!!");
            return true;
        }
        return false;
    }
}
