package com.codecool.geometry.utilities;

public class ShapeFormula {

    private final String perimeterFormula;
    private final String areaFormula;

    public ShapeFormula(String perimeterFormula, String areaFormula) {
        this.perimeterFormula = perimeterFormula;
        this.areaFormula = areaFormula;
    }

    public String getPerimeterFormula() {
        return perimeterFormula;
    }

    public String getAreaFormula() {
        return areaFormula;
    }

    @Override
    public String toString() {
        return "ShapeFormula{" +
                "perimeterFormula='" + perimeterFormula + '\'' +
                ", areaFormula='" + areaFormula + '\'' +
                '}';
    }
}
