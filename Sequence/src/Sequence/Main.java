package Sequence;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


            Scanner scan = new Scanner(System.in);

            Sequence seq = new Sequence();
            System.out.print("Enter the m: ");
            seq.SetFirstNumber(scan.nextLine());
            System.out.print("Enter the n: ");
            try {
                seq.SetLength(scan.nextLine());
            } catch (SequenceException e) {
                System.out.println(e.getMessage());
            }

            System.out.println(Arrays.toString(seq.getSequenceArr()));

    }

}

