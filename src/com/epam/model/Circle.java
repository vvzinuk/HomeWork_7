package com.epam.model;

class Circle extends Shape{
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "class = " + getClass().getSimpleName() + " : " +
                "radius = " + radius + " : " +
                "area = " + roundDouble( calcArea() ) + "; \n";
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }
}
