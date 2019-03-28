package com.epam.model;

class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "class = " + getClass().getSimpleName() + " : "  +
                "a = " + a + " : " +
                "b = " + b + " : " +
                "c = " + c + " : " +
                "area = " + roundDouble( calcArea() ) + "; \n";
    }

    @Override
    public double calcArea() {
        double p = (a + b + c)/2;
        return Math.sqrt( p * (p - a) * (p - b) * (p - c));
    }
}
