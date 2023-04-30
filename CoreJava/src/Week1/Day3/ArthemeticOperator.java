package Week1.Day3;

public class ArthemeticOperator {
    public static void main(String[] args) {
        //used to perform arithemetic operations
        int a = 5;
        int b = 6;

        //Addition
        System.out.println(a + "+ " + b + "=" + (a + b));

        //Post increment
        System.out.println(a++); //First prints a then only incerements it

        //Pre increment
        System.out.println(++a); //increments value of a and print it

        //subtarction
        System.out.println(a + "- " + b + "=" + (a - b));
        b--;

        //Multiplication
        System.out.println(a + "* " + b + "=" + (a * b));

        //Division
        System.out.println(a + "/ " + b + "=" + (a / b)); //quotent

        //Modulus
        System.out.println(a + "% " + b + "=" + (a % b)); //reminder

    }
}
