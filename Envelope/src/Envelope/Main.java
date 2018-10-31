package Envelope;

import java.util.Scanner;

import static Envelope.EnvelopeAnalysis.compare;

public class Main {

    private static final String Y = "y";
    private static final String YES = "yes";

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Envelope env1 = new Envelope();
        Envelope env2 = new Envelope();

        try {
            System.out.print("Please, enter the width of the envelope ");
            env1.setWidth(Double.parseDouble(scan.nextLine()));
            System.out.print("Do you want to enter the next size? Enter “y” or “yes” to add or other key to exit ");
            String answer = scan.nextLine();
            if (answer.equalsIgnoreCase(Y) || answer.equalsIgnoreCase(YES)) {
                System.out.print("Please, enter the height of the envelope ");
                env1.setHeight(Double.parseDouble(scan.nextLine()));
                System.out.print("Do you want to enter the next size? Enter “y” or “yes” to add or other key to exit ");
                answer = scan.nextLine();
                if (answer.equalsIgnoreCase(Y) || answer.equalsIgnoreCase(YES)) {
                    System.out.print("Please, enter the width of the envelope ");
                    env2.setWidth(Double.parseDouble(scan.nextLine()));
                    System.out.print("Do you want to enter the next size? Enter “y” or “yes” to add or other key to exit ");
                    answer = scan.nextLine();
                    if (answer.equalsIgnoreCase(Y) || answer.equalsIgnoreCase(YES)) {
                        System.out.print("Please, enter the height of the envelope ");
                        env2.setHeight(Double.parseDouble(scan.nextLine()));
                    }
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        if (compare(env1, env2)){
            System.out.println("You can put one envelope to another");
        } else {
            System.out.println("You can not put one envelope to another");
        }

    }
}