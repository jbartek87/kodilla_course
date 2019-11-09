package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String shapeName;
    private int a;
    private int h;

    public Triangle(String shapeName, int a, int h) {
        this.shapeName = shapeName;
        this.a = a;
        this.h = h;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    public int getA() {
        return a;
    }

    public int getH() {
        return h;
    }

    @Override
    public void getField() {
        System.out.println((a * h) / 2);
    }

}
