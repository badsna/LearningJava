package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrinterTest {
    @Test
    public void testSingleton(){
        //this can't be done cause consturtor is private
        //Printer p1=new Printer();
        Printer p1=Printer.getInstance();
        Printer p2=Printer.getInstance();
        //this  are the reference variable pointing to same object
        //assertEquals(p1,p2); //checks contain of the object

        if(p1==null || p2==null){
            //to write failure message by writing manual checking
            fail("p1,p2 references must not be null");
        }
        //after fail futher code is not executed
        assertSame(p1,p2); //checks if given variables points to same object

    }

}