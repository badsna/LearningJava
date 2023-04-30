package Week2.Day8;

public class ExceptionHandling {
    public static void main(String[] args) {

                try {
                    int a = 10 / 0;
                } catch (ArithmeticException e) {
                    System.out.println("Exception message: " + e.getMessage()); //diplays just exception
                    e.printStackTrace(); //displays detail information about exception
                }

        try {
            byte[] array = new byte[Integer.MAX_VALUE];
        } catch (OutOfMemoryError e) {
            System.err.println("Out of memory error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
