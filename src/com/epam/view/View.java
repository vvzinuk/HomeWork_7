package com.epam.view;

import com.epam.model.Shapes;

public class View implements Messages{
    public void print (Object obj){
        System.out.println(obj.toString());
    }

    public void printWithLabel (String label, Object object){
        System.out.print(label + object.toString() + "\n");
    }

    public void printTotalAreaByShapes (){
        System.out.println(CIRCLE_TOTAL + Shapes.calcTotalAreaByShapes()[0]);
        System.out.println(RECTANGLES_TOTAL + Shapes.calcTotalAreaByShapes()[1]);
        System.out.println(TRIANGLES_TOTAL + Shapes.calcTotalAreaByShapes()[2]);
    }
}
