package com.company;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        IncomingData data = new IncomingData();

        ChessBoard cb = new ChessBoard();

        try {

            int rows = data.getNumber("Enter any integer number of rows = ");

            int columns = data.getNumber("Enter any integer number of columns = ");

            cb.printBoard(rows, columns);

        } catch (InputMismatchException e) {
            System.out.println("Incorrect input, please try again");
        }

    }


}
