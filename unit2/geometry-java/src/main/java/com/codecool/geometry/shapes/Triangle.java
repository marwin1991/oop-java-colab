package com.codecool.geometry.shapes;

public class Triangle extends Shape {

    private final double a;
    private final double b;

    private final double c;

    public Triangle(double a, double b, double c, String perimeterFormula, String areaFormula) {
        super(perimeterFormula, areaFormula);
        this.a = a;
        this.b = b;
        this.c = c;

    }

    @Override
    public double calculateArea() {
        double p = .5 * (a+b+c);
        double x = p * (p-a) * (p-b) * (p-c);
        return Math.sqrt(x);
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "Triangle, " +
                "a=" + a +
                ", b=" + b +
                ", c=" + c
                ;
    }
}
