package com.Bridgelabs;

public class TicTacToeGame {
    public static void main(String[] args) {
        System.out.println("Welcome to Game");
        char[] board = createBoard();
    }

    private static char[] createBoard() {
        char[] board = new char[10];
        for (int i = 0; i < board.length; i++) {
            board[i] = ' ';
        }
        return board;
    }
}




