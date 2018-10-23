package com.company;

public class ChessBoard {
    private int rows;
    private int columns;

    public ChessBoard(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }

    public ChessBoard() {
    }

    public void printBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                String text = "*";

                if (i % 2 == 0 ^ j % 2 == 0) {
                    text = " ";
                }

                System.out.print(text);
            }

            System.out.println(" ");
        }
    }

    public void printBoard(int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i % 2 == 0 ^ j % 2 == 0) {
                    System.out.print((" "));
                } else {
                    System.out.print(("*"));
                }
            }
            System.out.println(" ");
        }
    }
}
