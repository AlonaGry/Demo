package com.company;

import java.util.Comparator;

public class Triangle {
    private String name;
    private double sideA;
    private double sideB;
    private double sideC;
    private double square;

    public Triangle() {
    }

    public double getSquare() {
        double p = (sideA + sideB + sideC) / 2;
        double square = Math.sqrt((p) * (p - sideA) * (p - sideB) * (p - sideC));
        return square;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSideA(double sideA) throws TriangleException {
        if (sideA < 0) throw new TriangleException("The side A is less then 0");
        this.sideA = sideA;
    }


    public void setSideB(double sideB) throws TriangleException {
        if (sideB < 0) throw new TriangleException("The side B is less then 0");
        this.sideB = sideB;
    }


    public void setSideC(double sideC) throws TriangleException {
        if (sideC < 0) throw new TriangleException("The side C is less then 0");
        this.sideC = sideC;
    }

    public void setSquare() {
        double p = (sideA + sideB + sideC) / 2;
        double square = Math.sqrt((p) * (p - sideA) * (p - sideB) * (p - sideC));
    }
}


