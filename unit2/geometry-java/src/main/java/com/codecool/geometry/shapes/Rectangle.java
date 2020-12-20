package com.codecool.geometry.shapes;

public class Rectangle extends Shape {

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    protected Rectangle(double width, double height, String className) {
        super(className);
        this.width = width;
        this.height = height;
    }


    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }


    //Rectangle, a = 2,00, b = 5,00
    @Override
    public String toString() {
        return "Rectangle, " +
                "a=" + width +
                ", b=" + height;
    }

    protected double getWidth() {
        return width;
    }

    protected double getHeight() {
        return height;
    }

}
