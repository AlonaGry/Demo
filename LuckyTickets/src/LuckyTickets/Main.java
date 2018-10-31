package LuckyTickets;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TicketsPack pack = new TicketsPack();
        System.out.println("Enter first: ");
        try {
            pack.setFirstInPack(Integer.parseInt(scan.nextLine()));
            System.out.println("Enter second: ");
            pack.setLastInPack(Integer.parseInt(scan.nextLine()));
            LuckyTicketsCount l = new LuckyTicketsCount();
            System.out.println((l.count(pack)));
        } catch (NumberFormatException ex){
            System.out.println("It's not an integer number");
        } catch (MyException e){
            System.out.println(e.getMessage());
        }
    }
}
