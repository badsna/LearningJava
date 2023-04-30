package org.example;
//Main class or service class
public class BankLoanService {
    public float calcSimpleInterestAmt(float pAmt,float rate,float time){
        System.out.println("BankLoanService.calcSimpleInterestAmt");
        if(pAmt<=0||rate<=0|| time<=0)
            throw new IllegalArgumentException("invalid inputs");
//        try{
//            Thread.sleep(30000);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        return pAmt*rate*time/100.0f;
    }
}
