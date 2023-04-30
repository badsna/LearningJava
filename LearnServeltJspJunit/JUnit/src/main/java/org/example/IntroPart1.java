package org.example;

public class IntroPart1 {
    /*
    -Each task given to a programmer is a unit and test that is doen tot test the unit is called unit testing
Unit Testing=>The test done by programmer on won piece of code  is called unit testinh.
Peer Testing=>The unit testing done on 1 programmer's code  by another programmer is called peer testing
Note:testing=matching  expected result with actual results.
                if match test result  is positive(successful)
                is not match test result is negative(failure)
Development-->Unit/peer testing should  be done continuously by programmer  until test result are postive

Testing done by developers:
    -Unit
    -Peer
    -Integration

Testing done by tester
    -Performance
    -Navigation
    -User-experience

Unit testing can be done  in two ways
1.Manual
    -limitations:
        -Takes time
        -writing test report is complex process
        -Presenting test plans/test case to superior
        -Test regression(repeating the tests)
    -To overcome these problems:
        -JUnit
        -HttpUnit(or web application)
        -mockito
        -TestNg

Note:Failure:Anticipated result come  but is not matched with Expected results
    Error: Exception come,unanticipated result have came

2.Automated


################# While workingwith JUnit we can see 3 main components
a) Service  class/Main class(class to be tested)
b)Test case class (The class that contains  test methods)(1 or more)
c)TestSuite:: Allows to combine multiple test case classes to generated the test report(0 or 1)


JUnit conatins 3 runtime libaries
    a)Junit jupitor::JUnit5 libraries
    b)JUnit Vintage:
    c)Jnunit Integration

JUnit5 Jupitor api gives
    a)Annotations
        i.@Test
        ii.@DisplayName
        iii.@BeforeEach
        iv.@AfterEach
        v.@BeforeAll
        vi. @AfterAll
        vii. @Tag
        viii. @ParameterizedTest
        ix. @ValueSource
        x. @NullSource
        xi. @EmptySource
        xii.@NullAndEmptySource
        xiii.@TestMethodOrder
        xiv. @Order

    b)Assertion API (gives Assertion.assertXxx() method(static methods) to match actual result with expected result and generate test report
        -fail
        -assertTrue
        -N/A
        -assertSame
        -assertNull
        -assertNotSame
        -assertNotNull
        -assertFalse
        -assertEqual
        -assertArrayEquals
        -assertAll
        -assertThrows
     */
}
