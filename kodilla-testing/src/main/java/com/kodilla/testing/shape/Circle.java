package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String shapeName;
    private int r;

    public Circle(String shapeName, int r) {
        this.shapeName = shapeName;
        this.r = r;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    public int getR() {
        return r;
    }

    @Override
    public void getField() {
        System.out.println(Math.PI * (r * r));
    }
}
