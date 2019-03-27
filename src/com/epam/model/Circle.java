package com.epam.model;


public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "class = " + getClass().getSimpleName() + " : " +
                "radius = " + radius + " : " +
                "area = " + calcArea() + "; \n";
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }
}
