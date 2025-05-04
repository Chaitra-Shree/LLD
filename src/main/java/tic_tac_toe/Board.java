package tic_tac_toe;

public class Board {
    int n;
    PlayerSymbol[][] board;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public PlayerSymbol[][] getBoard() {
        return board;
    }

    public void setBoard(PlayerSymbol[][] board) {
        this.board = board;
    }

    public Board(int n) {
        this.n = n;
        board = new PlayerSymbol[n][n];
    }

    public void printBoard(PlayerSymbol[][] board) {
        for(int i = 0 ; i < board.length ; i++) {
            for(int j = 0 ; j < board.length ; j++) {
                if(board[i][j]== null)
                    System.out.print("_ ");
                else
                    System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
