package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.doReturn;

/*
Spy object are used to check how many methods are called?
Whether they are called or not.because spy objects is always linked with real objects
//for this use Mockito.verify()

 */
public class MockVSSpyTest {
    @Test
    public void testList(){
        //for Mock
        List<String> list= Mockito.mock(List.class);
        //for  Spy
        List<String> list1=Mockito.spy(new ArrayList<>());
         list.add("table");
         //for stub
         Mockito.when(list.size()).thenReturn(10);
         list1.add("table");
         //to do stubing in spy
        Mockito.when(list1.size()).thenReturn(10);

        System.out.println(list.size()+" "+ list1.size());
    }
}
