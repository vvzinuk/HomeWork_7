package com.epam.view;

import java.util.Scanner;

public class InputUtility {

    private static Scanner sc = new Scanner(System.in);
    public static int inputIntValueWithScanner(View view) {
        while( !sc.hasNextInt()) {
            view.print(Messages.WRONG_INPUT_INT_DATA + sc.next());
        }
        return sc.nextInt();
    }
}