package Day3;

import java.util.Scanner;

public class OperatorTask {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter price");
        float mealPrice=sc.nextFloat();

        System.out.println("Enter tip percentage");
        float tipPercentage=sc.nextFloat();


        System.out.println("Enter tax percentage");
        float taxPercentage=sc.nextFloat();

        float tip=tipPercentage/100 *mealPrice;


        float tax=taxPercentage/100 *mealPrice;
        float totalCost;

        if(mealPrice>=5000 && mealPrice<10000){
            mealPrice=mealPrice-500;
        }

        else if(mealPrice>10000){
            mealPrice=mealPrice-700;
            tip=tip-(float) 20/100 * tip;
        }
        totalCost=mealPrice+tip+tax;
        System.out.println(mealPrice);
        System.out.println(tip);
        System.out.println(tax);
        System.out.println(totalCost);

    }
}
