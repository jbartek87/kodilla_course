package com.kodilla.testing.shape;

public class Square implements Shape {
    private String shapeName;
    private int a;

    public Square(String shapeName, int a) {
        this.shapeName = shapeName;
        this.a = a;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    public int getA() {
        return a;
    }

    @Override
    public void getField() {
        System.out.println(a * a);
    }
}
