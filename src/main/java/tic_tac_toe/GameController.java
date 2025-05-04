package tic_tac_toe;

import java.util.Scanner;
public class GameController {

    public void startGame() {
        System.out.println("Enter the board size");
        Scanner sc = new Scanner(System.in);
        int boardSize = sc.nextInt();
        Board board = new Board(boardSize);

        int totalMoves = 0;
        boolean turn = true;
        int[] row = new int[boardSize];
        int[] col = new int[boardSize];
        int diagonal1 = 0, diagonal2 = 0;
        WinningStrategy winningStrategy = new DefaultWinningStrategy();

        while(totalMoves!= (boardSize*boardSize)) {
            if(turn == true) {
                System.out.println("Player 1 to enter the row and column");
                System.out.println("Row: ");
                int pRow = sc.nextInt();
                System.out.println("Col: ");
                int pCol = sc.nextInt();
                if(!isValidMove(board.getBoard(), pRow, pCol)) {
                    continue;
                }
                board.board[pRow][pCol] = PlayerSymbol.X;

                row[pRow] -=1;
                col[pCol] -=1;
                if(pRow == pCol) diagonal1--;
                if(pRow == (boardSize-1-pCol)) diagonal2--;

            }
            else {
                System.out.println("Player 2 to enter the row and column");
                System.out.println("Row: ");
                int pRow = sc.nextInt();
                System.out.println("Col: ");
                int pCol = sc.nextInt();
                if(!isValidMove(board.getBoard(), pRow, pCol)) {
                    continue;
                }
                board.board[pRow][pCol] = PlayerSymbol.O;

                row[pRow] +=1;
                col[pCol] +=1;
                if(pRow == pCol) diagonal1++;
                if(pRow == (boardSize-1-pCol)) diagonal2++;
            }
            turn =!turn;
            totalMoves++;
            if(winningStrategy.checkWin(board.getBoard(), row, col, diagonal1, diagonal2, totalMoves)) {
                break;
            }
            board.printBoard(board.getBoard());
        }
    }

    private boolean isValidMove(PlayerSymbol[][] board, int row, int col) {
        int n = board.length;
        if(row < 0 || row > n-1 || col < 0 || col > n-1 || board[row][col] != null) {
            return false;
        }
        return true;
    }


}
