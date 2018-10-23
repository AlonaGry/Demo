package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IncomingData {

    public static final Scanner SCANNER = new Scanner(System.in);

    public int getNumber(String message) {

        System.out.print(message);

        return SCANNER.nextInt();

    }
}
