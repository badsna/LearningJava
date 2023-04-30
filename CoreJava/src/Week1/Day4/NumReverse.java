package Week1.Day4;

public class NumReverse {
    public static int reverse(int num) {
        int rem;
        int rev = 0;
        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println("reverse is " + reverse(153));

    }

}
