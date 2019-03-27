package com.epam.model;

import java.util.Arrays;

public class Shapes extends Shape {
    Shape[] array = {new Rectangle( 20.8,4.9 ),
            new Rectangle( 10,20 ),
            new Rectangle( 15.6,23.1 ),
            new Rectangle( 20,20.5 ),
            new Circle(0.2),
            new Circle(10),
            new Circle(2.99),
            new Triangle( 11,4,12 ),
            new Triangle( 4,2,5 ),
            new Triangle( 12,10,21 )};

    @Override
    public String toString() {
        String result = "";
        for (Shape index: array) {
            result += index.toString();
        }
     return result;
    }

    @Override
    public double calcArea() {
        double result = 0;
        for (Shape index: array) {
            result += index.calcArea();
        }
        return result;
    }

    public double[] calcTotalAreaByShapes (){
        double[] result = new double[3];
        double circlesArea = 0;
        double rectanglesArea = 0;
        double trianglesArea = 0;
        for (Shape index: array) {
            if(index instanceof Circle){
                circlesArea += index.calcArea();
            } else if (index instanceof Rectangle){
                rectanglesArea += index.calcArea();
            } else if (index instanceof Triangle){
                trianglesArea += index.calcArea();
            }
        }
        result[0] = circlesArea;
        result[1] = rectanglesArea;
        result[2] = trianglesArea;
        return result;
    }

    public void printTotalAreaByShapes (){
        System.out.println("Circles total area is: " + calcTotalAreaByShapes()[0]);
        System.out.println("Rectangles total area is: " + calcTotalAreaByShapes()[1]);
        System.out.println("Triangles total area is: " + calcTotalAreaByShapes()[2]);
    }
}
