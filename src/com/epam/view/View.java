package com.epam.view;

public class View implements Messages{
    public void print (Object obj){
        System.out.println(obj.toString());
    }

    public void printWithLabel (String label, Object object){
        System.out.println(label + object.toString());
    }
}
