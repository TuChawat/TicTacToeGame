package com.Bridgelabs;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        System.out.println("Welcome to Game");
        char[] board = createBoard();
        Scanner userInput = new Scanner(System.in);
        char userLetter = chooseUserLetter(userInput);
        char computerLetter = (userLetter == 'X') ? 'O' : 'X';
        showBoard(board);
        int userMove = getUserMove(board, userInput);
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
    private static int getUserMove(char[] board, Scanner userInput) {
        Integer[] validCells = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        while (true) {
            System.out.print("What is your next move? (1-9: ");
            int index = userInput.nextInt();
            if (Arrays.asList(validCells).contains(index) && isSpaceFree(board, index))
                return index;
        }
    }
    private static boolean isSpaceFree(char[] board, int index) {
        return board[index] == ' ';
    }
}




