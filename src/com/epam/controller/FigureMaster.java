package com.epam.controller;

import com.epam.model.Shape;
import com.epam.model.Shapes;
import com.epam.view.*;

public class FigureMaster implements Messages{
    private View view = new View();
    private Shapes shapes = new Shapes();
    private boolean status = true;

    public void run(){
        while(status) {
            view.print( MENU );
            switcher( InputUtility.inputIntValueWithScanner( view ) );
        }
    }

    private void switcher (int position){
        switch (position){
            case 1:
                view.print( shapes );
                break;
            case 2:
                view.printWithLabel( TOTAL_AREA, Shape.roundDouble(shapes.calcArea()) );
                break;
            case 3:
                view.printWithLabel( CIRCLE_TOTAL, Shape.roundDouble(Shapes.calcTotalAreaByShapes()[0] ));
                view.printWithLabel( RECTANGLES_TOTAL, Shape.roundDouble(Shapes.calcTotalAreaByShapes()[1] ));
                view.printWithLabel( TRIANGLES_TOTAL, Shape.roundDouble(Shapes.calcTotalAreaByShapes()[2] ));
                break;
            case 4:
                status = false;
        }
    }
}
