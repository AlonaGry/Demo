package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortTriangles implements Comparator {
    private ArrayList<Triangle> trianglesList;
    private Triangle triangle;


    public Triangle IncomingData(String data) throws Exception{

        try {
            String[] side = data.split(",");

            double A = Double.parseDouble(side[1]);
            double B = Double.parseDouble(side[2]);
            double C = Double.parseDouble(side[3]);

            if ((A + B > C) && (A + C > B) && (B + C > A)){
                Triangle triangle = new Triangle();

                triangle.setName(side[0]);
                triangle.setSideA(Double.parseDouble(side[1].trim()));
                triangle.setSideB(Double.parseDouble(side[2].trim()));
                triangle.setSideC(Double.parseDouble(side[3].trim()));
                triangle.getSquare();

            } else {
                throw new TriangleException("It is not triangle");
            }
        }
        catch (NumberFormatException e){
            new NumberFormatException("It is not an integer number");
        }
        return triangle;
    }

    public void AddTriangle(Triangle triangle){

        trianglesList.add(triangle);

    }

    @Override
    public int compare(Object o1, Object o2) {
        return (int) (((Triangle)o1).getSquare()-((Triangle)o2).getSquare());
    }

    public void SortTriangles(){

        Collections.sort(trianglesList);
    }

}

