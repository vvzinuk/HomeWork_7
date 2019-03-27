package com.epam.controller;

public class Validator {
    public void checkInputData(double radius) {
        if (radius < 0) {
            System.out.println( "Message from view" );
        }
    }

    public void checkInputData(double width, double height) {
        if (width < 0 || height < 0) {
            System.out.println( "Message from view" );
        }
    }

    public void checkInputData(double a, double b, double c) {
        if ((a < 0 || b < 0 || c < 0)
                || (a + b) <= c || (a + c) <= b || (c + b) <= a) {
            System.out.println( "Message from view" );
        }
    }

}
