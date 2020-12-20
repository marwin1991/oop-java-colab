package com.codecool.geometry;

import com.codecool.geometry.containers.ShapeCollection;
import com.codecool.geometry.shapes.Circle;
import com.codecool.geometry.shapes.EquilateralTriangle;
import com.codecool.geometry.shapes.Rectangle;
import com.codecool.geometry.shapes.RegularPentagon;
import com.codecool.geometry.shapes.Square;
import com.codecool.geometry.shapes.Triangle;
import com.codecool.geometry.utilities.ShapeTablePrinter;

public class Main {

    public static void main(String[] args) {
        ShapeCollection shapeCollection = new ShapeCollection();
        shapeCollection.addShape(new Square(4, "a*a", "4*a"));
        shapeCollection.addShape(new Triangle(6, 7, 8, "a+b+c", "sqrt(s×(s-a)×(s-b)×(s-c))"  ));

        boolean isRunning = true;

        while (isRunning) {
            int option = 2;  // TODO read the keyboard here

            switch (option) {
                case 1:
                    // TODO Add new shape
                    break;
                case 2:
                    // TODO Show all shapes
                    String shapeTable = ShapeTablePrinter.getTable(shapeCollection.getShapes());
                    System.out.println(shapeTable);
                    System.exit(123);

                    break;
                case 3:
                    // TODO Show shape with the largest perimeter
                    break;
                case 4:
                    // TODO Show shape with the largest area
                    break;
                case 5:
                    // TODO Show formulas
                    break;
                case 0:
                    // TODO Exit
                    break;
            }
        }
    }


}
