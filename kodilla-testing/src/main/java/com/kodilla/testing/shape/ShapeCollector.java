package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> shapes = new ArrayList<>();

    public int shapesQuantity() {
        return shapes.size();
    }

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        return shapes.get(n);
    }

    public void showFigures() {
        for (Shape figures : shapes) {
            System.out.println(figures);
        }
    }

}
