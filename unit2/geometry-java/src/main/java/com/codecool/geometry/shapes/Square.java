package com.codecool.geometry.shapes;

public class Square extends Rectangle {


    public Square(double a, String perimeterFormula, String areaFormula) {
        super(a, a, perimeterFormula, areaFormula);
    }

    @Override
    public String toString() {
        return "Square, " + "a=" + super.getWidth();
    }
}
