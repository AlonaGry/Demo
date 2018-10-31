package Sequence;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            Sequence seq = new Sequence();
        do {
            System.out.println("Enter the m: ");
            try {
                seq.SetFirstNumber(scan.nextLine());
            } catch (MyException ex) {
                System.out.println(ex.getMessage());
            }
        } while (seq.getFirstNumber()== -1);

        do {
        System.out.println("Enter the n: ");
            try {
                seq.SetLength(scan.nextLine());
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
            }while (seq.getLength()==-1);
            System.out.println(Arrays.toString(seq.getSequenceArr()));

    }

}

