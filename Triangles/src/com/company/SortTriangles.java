package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class SortTriangles implements Comparator{
    private List<Triangle> trianglesList;
    private Triangle triangle;

    public SortTriangles(){
        trianglesList = new ArrayList<>();
    }

    public List<Triangle> addTriangle(String data) throws TriangleException {


        double A = -1;
        double B = -1;
        double C = -1;

        String[] side = data.split(",");
        try {
            A = Double.parseDouble(side[1]);
            B = Double.parseDouble(side[2]);
            C = Double.parseDouble(side[3]);
        } catch (NumberFormatException e) {
          throw new TriangleException("It is not an integer number");
        }

        if ((A + B > C) && (A + C > B) && (B + C > A)) {
            Triangle triangle = new Triangle();

            triangle.setName(side[0]);
            triangle.setSideA(A);
            triangle.setSideB(B);
            triangle.setSideC(C);
            triangle.setSquare();
            trianglesList.add(triangle);

        } else {
            throw new TriangleException("It is not a triangle");
        }

        return trianglesList;
    }

    public void printTrianglesList(){
        for(Triangle triangle : trianglesList){
            System.out.println("[Triangle " + triangle.getName() + "]: " + triangle.getSquare() + " cm^2");
        }
    }

    @Override
    public int compare(Object o1, Object o2) {
        return (int) (((Triangle)o1).getSquare()-((Triangle)o2).getSquare());
    }



}

