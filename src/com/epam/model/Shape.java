package com.epam.model;

public class Shape {
    public Shape() {
    }

    @Override
    public String toString() {
        return "class = " + getClass().getSimpleName();
    }

    public double calcArea(){
        return 0.0;
    }
}
