package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CensusServiceTest {
//    @Test //runs only one time
//
//    @RepeatedTest(value =10, name = "execution of {displayName}=[{currentRepetition}/{totalRepetitions}]") //runs 10 times
//    @DisplayName("Repetition")
//    public void testexportData(){
//        CensusService service=new CensusService();
//        assertEquals("data exported",service.exportData());
//    }

    //used to run the method having different parameter each time method gets executed
//    @ParameterizedTest
//    @ValueSource(ints = {10,21,34,56,11,78}) //pass all ints
//    public void testisOdd(int n){
//        System.out.println("CensusServiceTest");
//        CensusService service=new CensusService();
//    assertTrue(service.isOdd(n));
//    }

    @ParameterizedTest
//    @ValueSource(strings={""," ","k"})
   //when you want to give whitespace character kind of empty character use @EmptySource
//    @EmptySource

    //@NullSource provides error
    @NullAndEmptySource //one time it will pass null value, another time it will pass empty value
    public void testisEmpty(String user){
        CensusService service=new CensusService();
        assertTrue(service.isEmpty(user));
    }

}