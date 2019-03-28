package com.epam.controller;

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
                view.printWithLabel( TOTAL_AREA, shapes.calcArea() );
                break;
            case 3:
                view.printTotalAreaByShapes();
                break;
            case 4:
                status = false;
        }
    }
}
