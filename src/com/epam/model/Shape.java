package com.epam.model;

public class Shape {
    Shape() {
    }

    @Override
    public String toString() {
        return "class = " + getClass().getSimpleName();
    }

    public double calcArea(){
        return 0.0;
    }

    public static double roundDouble (double real){
        return Math.round(real * 100.0) / 100.0;
    }
}
