package Week1.Day3;

public class AssignmentOperators {
    public static void main(String[] args) {
        //used to assign values to variables
        int a;
        //directly assign value to a;
        a=2;
        System.out.println("value of a after initalization " +a);

        int b=3;
        a+=b; //a=a+b
        System.out.println(a);

        a-=b; //a=a-b;
        System.out.println(a);

        a*=b;//a=a*b;
        System.out.println(a);

        a/=b;//a=a/b
        System.out.println(a);

        a%=b; //a=a%b
        System.out.println(a);
    }
}
