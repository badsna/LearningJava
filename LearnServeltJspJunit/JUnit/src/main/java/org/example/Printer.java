package org.example;

public class Printer {
    //to check if it is singleton class of not
    private static Printer INSTANCE=new Printer();
    //private constructor so anyone outside this class cannot create object
    private Printer(){

    }
    public static Printer getInstance(){
        return INSTANCE;
    }
}
