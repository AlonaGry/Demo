package com.company;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        String answer;

        Scanner scan = new Scanner(System.in);

      SortTriangles sortTriangles = new SortTriangles();

        do {
            try {
                System.out.println("Enter parameters of triangle in the format: <Name><,><side 1><,><side 2><,><side 3>");
                sortTriangles.addTriangle(scan.nextLine());
            } catch (TriangleException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Do you want to add new triangle? Enter “y” or “yes” to add or other key to exit");
            answer = scan.nextLine().toLowerCase();
        } while (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes"));

        System.out.println("============= Triangles list: ===============");

        sortTriangles.printTrianglesList();

    }
}

