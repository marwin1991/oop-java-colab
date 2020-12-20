package com.codecool.geometry.utilities;

import com.codecool.geometry.shapes.Shape;

import java.text.DecimalFormat;
import java.util.List;

public class ShapeTablePrinter {

    public static String getTable(List<Shape> shapeList) {
        String tableString = "";
        DecimalFormat df = new DecimalFormat("#0.00");

        for (int i = 0; i < shapeList.size(); i++) {

            String row = i + " ; " + shapeList.get(i).getClass().getSimpleName() + " ; " +
                    shapeList.get(i).toString() + " ; " +
                    shapeList.get(i).calculatePerimeter() + " ; " + shapeList.get(i).getPerimeterFormula() + " ; " +
                    df.format(shapeList.get(i).calculateArea()) + " ; " + shapeList.get(i).getAreaFormula() + " ; ";

            tableString += row + System.lineSeparator();
        }

        return tableString;
    }
}
