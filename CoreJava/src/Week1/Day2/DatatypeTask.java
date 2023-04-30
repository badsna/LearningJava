package Week1.Day2;

import java.util.Scanner;

public class DatatypeTask {
    public static void main(String[] args) {
        //yo garyo vanya complexity badxa so
//        List<String> addVal = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value");
        String str=sc.next();

        long a;
        try {
            a = Long.parseLong(str);
            if (a <= Byte.MAX_VALUE) {
                System.out.println("byte,short,int,long");
                System.out.println("byte is must preferred");
            } else if (a <= Short.MAX_VALUE) {
                System.out.println("short,int,long");
                System.out.println("short is best");
            } else if (a <= Integer.MAX_VALUE) {
                System.out.println("int,long");
                System.out.println("integer is best");
            } else {
                System.out.println("long");
                System.out.println("long is best");
            }

        } catch (NumberFormatException e) {
            System.out.println("cant be fitted");

        }


    }
}
