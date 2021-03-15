package com.Bridgelabs;

import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        System.out.println("Welcome to Game");
        char[] board = createBoard();
        Scanner userInput = new Scanner(System.in);
        char userLetter = chooseUserLetter(userInput);
        char computerLetter = (userLetter == 'X') ? 'O' : 'X';
        showBoard(board);
    }

    private static char[] createBoard() {
        char[] board = new char[10];
        for (int i = 0; i < board.length; i++) {
            board[i] = ' ';
        }
        return board;
    }
    public static char chooseUserLetter(Scanner userInput) {
        System.out.print("Choose your Letter: ");
        return userInput.next().toUpperCase().charAt(0);
    }
    private static void showBoard(char[] board) {
        System.out.println("\n " + board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("-----------");
        System.out.println(" " + board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("-----------");
        System.out.println(" " + board[7] + " | " + board[8] + " | " + board[9]);
    }
}


