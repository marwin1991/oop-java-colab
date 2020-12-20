package com.codecool.geometry.utilities;

import java.util.HashMap;
import java.util.Map;

public class FormulaProvider {

    private static final Map<String, ShapeFormula> formulas = new HashMap<>();

    static {
        formulas.put("Circle", new ShapeFormula("2×π×r", "π×r×r"));
        formulas.put("Square", new ShapeFormula("4×a", "a×a"));
    }

    /**
     * Returns the area formula for a given shape.
     *
     * @param shape type of the shape of the requested formula
     * @return area formula
     */
    public static String getAreaForShape(String shape) {
        System.out.println(formulas);
        if(formulas.containsKey(shape)) {
            return formulas.get(shape).getAreaFormula();
        } else {
            return "Unknown formula for shape: " + shape;
        }
    }

    /**
     * Returns the perimeter formula for a given shape.
     *
     * @param shape type of the shape of the requested formula
     * @return perimeter formula
     */
    public static String getPerimeterForShape(String shape) {
        if(formulas.containsKey(shape)) {
            return formulas.get(shape).getPerimeterFormula();
        } else {
            return "Unknown formula for shape: " + shape;
        }
    }
}
