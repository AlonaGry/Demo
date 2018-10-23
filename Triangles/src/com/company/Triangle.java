package com.company;

public class Triangle {
    private String name;
    private double sideA;
    private double sideB;
    private double sideC;
    private double square;

    public Triangle() {
    }

    public double getSquare() {
        return square;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSideA(double sideA) throws Exception {
        if (sideA < 0) throw new Exception("The side A is less then 0");
        this.sideA = sideA;
    }


    public void setSideB(double sideB) throws Exception {
        if (sideB < 0) throw new Exception("The side B is less then 0");
        this.sideB = sideB;
    }


    public void setSideC(double sideC) throws Exception {
        if (sideC < 0) throw new Exception("The side C is less then 0");
        this.sideC = sideC;
    }

    public void setSquare() throws TriangleException {
        if ((sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA)) {
            double p = (sideA + sideB + sideC) / 2;
            double squeare = Math.sqrt((p) * (p - sideA) * (p - sideB));
        } else {
            throw new TriangleException("It is not triangle");
        }

    }

}

