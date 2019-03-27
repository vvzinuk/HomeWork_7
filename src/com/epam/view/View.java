package com.epam.view;

public class View{
    public void print (String string){
        System.out.println(string);
    }

    public void print (Object obj){
        System.out.println(obj.toString());
    }
}
