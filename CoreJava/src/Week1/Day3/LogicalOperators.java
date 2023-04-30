package Week1.Day3;

public class LogicalOperators {
    public static void main(String[] args) {
        //used to check whether an expression is true or false

        //logical and
        //both value must be true
        //& auta false vaya paxe ne aru ko check garxa && auta false hune betekaii aruko check gardaina
        System.out.println("logicaland");
        System.out.println((10>5) &&(15<20) );
        System.out.println((10<5) &&(15>20) );
        System.out.println((10>5) &&(15>20) );

        //logical or
        System.out.println("logical or");
        System.out.println((10>5) ||(15<20) );
        System.out.println((10<5) ||(15>20) );
        System.out.println((10>5) ||(15>20) );

        //logical not
        //alters boolean value
        System.out.println("logical not");
        System.out.println(!(5==3));
        System.out.println(!(3==3) );
    }
}
