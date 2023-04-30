package Week1.Day3;

public class BitwiseOperators {
    public static void main(String[] args) {
        //bitwise operator converts the value in binary and does operation

        int a=5;
        int b=4;
        System.out.println("logicaland");
        System.out.println("a & b =" + (a&b));

        System.out.println("a |b " + (a|b));

        //XOR (both value same then =>0)
        System.out.println("a ^ b " + (a^b));

        //2's complement or not
        System.out.println("~a=" + (~a)); //~a=-a-1

        //left shift
        System.out.println("a <<2 " + (a<<2));

        //right shift
        System.out.println("b>> " + (b>>2));
    }
}
