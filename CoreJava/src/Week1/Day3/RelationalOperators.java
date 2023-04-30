package Week1.Day3;

public class RelationalOperators {
    public static void main(String[] args) {
        //used to check the relational between two operands

        int a = 10;
        int b = 13;
        int c = 2;
        int d = 10;
        String str="Hello";
        String str1="hello";
        String str2=str;
        //##############################
        //Equal to operatoor
        if(str==str1){  //checks the content value
            System.out.println("str1 is equal to str");
        }
        else{
            System.out.println("str1 is not equal to str");
        }

        if(str==str2){
            System.out.println("str is equal to str2");
        }
        else{
            System.out.println("str is not equal to str2");
        }

        if (a == d) {
            System.out.println("Equal");
        }

        //########################
        //Not Equal to
        if (a != b) {
            System.out.println("not equal");
        }

        //#####################
        //Greater Than
        if (a > b) {
            System.out.println("a is greater than b");
        }else System.out.println("a is not greater than b");

        //Lesser than
        if (a < b) {
            System.out.println("a is lesser than b");
        }else System.out.println("a is not lesser than b");

        //Greater than or equal to

        if (a >= b) {
            System.out.println("a is greater than or equal to b");
        }else System.out.println("a is not greater than or equal to b");

        //lesser than or equal to
        if (a <= d) {
            System.out.println("a is less than or equal");
        }else  System.out.println("a is not less than or equal");
    }
}
