package org.example;

public class IntroPart2 {
    /*
    MethodOrderer(I) is having multiple Inner classes implementing same MethodOrderer(I).
    They are:
        a) MethodName
        b) DisplayName (gives ambiguity with @DisplayName, so specify Method.DisplayName.class)
        c) OrderAnnotation
        d) Random(default)  (gives ambiguity  so specify Method.Random.class)
        e) AlphaNumeric(deprecated)

In Real Scenarios  we need to execute the App./Project in 4 environment
    a)Dev
    b) Test
    c) UAT(User acceptance environment)
    d)Production

@Tag method is to categorize the test method to run in different environment
-can be repeated multiple times

-TestInfo as a parameter to get the information about method

-Allows to execute test method repeatedly for multiple times having control on count and name

@RepeatedTest=>will execute method with same data and will not take any other data as input
               =>for batch processing/update related test
@ParameterizedTes=>will execute method with different data every time
                =>we can supply values using @ValueSource and other anotation
     */
}
