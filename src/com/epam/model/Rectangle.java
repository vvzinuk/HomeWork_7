package com.epam.model;

class Rectangle extends Shape {
    private double width;
    private double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "class = " + getClass().getSimpleName() + " : "  +
               "width = " + width + " : " +
               "height = " + height + " : " +
               "area = " + roundDouble( calcArea() ) + "; \n";
    }

    @Override
    public double calcArea() {
        return width * height;
    }
}
