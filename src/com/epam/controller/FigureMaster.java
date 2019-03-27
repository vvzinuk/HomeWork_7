package com.epam.controller;

import com.epam.model.Shapes;
import com.epam.view.*;

public class FigureMaster {
    View view = new View();
    Shapes shapes = new Shapes();
    boolean status = true;

    public void run(){
        while(status) {
            view.print( Messages.MENU );
            switcher( InputUtility.inputIntValueWithScanner( view ) );
        }
    }

    private void switcher (int position){
        switch (position){
            case 1:
                view.print( shapes );
                break;
            case 2:
                view.print( shapes.calcArea() );
                break;
            case 3:
                shapes.printTotalAreaByShapes();
                break;
            case 4:
                status = false;
        }
    }
}
