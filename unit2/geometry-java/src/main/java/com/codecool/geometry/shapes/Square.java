package com.codecool.geometry.shapes;

public class Square extends Rectangle {


    public Square(double a) {
        super(a, a, "Square");
    }

    @Override
    public String toString() {
        return "Square, " + "a=" + super.getWidth();
    }
}
