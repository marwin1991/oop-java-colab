package com.codecool.geometry.containers;

import com.codecool.geometry.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollection {

    private List<Shape> shapesContainer;

    public ShapeCollection() {
        this.shapesContainer = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        shapesContainer.add(shape);
    }


    public List<Shape> getShapes() {
        return shapesContainer;
    }
}
