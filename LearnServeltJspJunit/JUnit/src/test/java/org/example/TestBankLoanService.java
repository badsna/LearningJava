package org.example;

import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.*;
//on the basis of order number
//@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)

//on the basis of method name
//@TestMethodOrder(value = MethodOrderer.MethodName.class)

//on the basis of display name
//@TestMethodOrder(value = MethodOrderer.DisplayName.class)

//randomly
@TestMethodOrder(value = MethodOrderer.Random.class)

public class TestBankLoanService {
private static BankLoanService service;
@BeforeAll
@DisplayName("0")

public static void setUpOnce(){
    service=new BankLoanService();
}

//    @BeforeEach //is used in method with is excuted for every other method
//    public void setUp(){
//        service=new BankLoanService();
//    }
    @Test //to make the method of testcase class as the Test method
    @DisplayName("1st") //to display customized name instead of method name
//    @Order(1) //low value provides high priority to execute method on the basis of order
    @Tag("dev")
    public void testcalcSimpleInterestAmtWithSmallNumber(){
//        BankLoanService service=new BankLoanService();
        float actual=service.calcSimpleInterestAmt(100000,2,12);
        float expected=24000.0f;
        assertEquals(expected,actual); //to check expected result is equal or not with actual result
    }

    @Test
    @DisplayName("2nd")
//    @Order(2)
  //  @Disabled //to stop method from being executed
    @Tag("uat")
    public void testcalcSimpleInterestAmtWithBigNumber(){
//        BankLoanService service=new BankLoanService();
        float actual=service.calcSimpleInterestAmt(10000000,2,12);
        float expected=2400000.15f;
        //here error comes but i want to neglate this so we use delta
        //0.5 is the difference  that is allowed in the calculation
        assertEquals(expected,actual,0.5,"may be results not matching");
    }

    @Test
//    @Order(4)
    @DisplayName("3rd")
    @Tag("dev")
    public void testcalcSimpleInterestAmtWithInvalidInputs(){
//        BankLoanService service=new BankLoanService();
        //thrown exception must be caught otherwise error will come instead of failure
        assertThrows(IllegalArgumentException.class,()->{
            //assertThrows:: to check expected exception has come or not
            //this is the place to call function
            service.calcSimpleInterestAmt(0,0,0);
        });


    }

    //@Test
//    public void testcalcSimpleInterestAmtWithTimer(){
//        BankLoanService service=new BankLoanService();
//        //this tells my calculation must finish in 20000 millis but i have kept the thread sleep at 30000
//        //to check wheather b.method execution is completed in specific time or not
//       assertTimeout(Duration.ofMillis(20000),
//               ()->{
//           service.calcSimpleInterestAmt(100000000,2,12);
//               }
//               );
//
//
//    }

    @Test
    @Tag("prod")
    @Tag("uat")
    @DisplayName("4th")
//    @Order(3)
    public void testcalcSimpleInterestAmtForNoException(TestInfo info){
//        BankLoanService service=new BankLoanService();
        //as getTestClass is optional so get().getName()
        System.out.println(info.getClass()+" "+info.getDisplayName() +" " +info.getTestMethod()+ " "+ info.getTags()+ " "+info.getTestClass().get().getName());
        assertDoesNotThrow(()->{
            service.calcSimpleInterestAmt(100000,2,12);
        });
    }
//    @AfterEach  //to place common logic that should execute after each Test method execution
//    public void clear(){
//        System.out.println("TestBankLoanService.clear()");
//        service=null;
//    }

    @AfterAll
    @DisplayName("5th")
    public static void clear(){
        System.out.println("TestBankLoanService.clear()");
        service=null;
    }


}
