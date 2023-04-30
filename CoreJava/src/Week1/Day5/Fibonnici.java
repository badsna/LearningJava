package Week1.Day5;

public class Fibonnici {
    public void fino(int n){
        int a=0;
        int b=1;
        int c=0;
        int d=0;
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<n-2;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        int n=5;
        Fibonnici fibonnici=new Fibonnici();
        fibonnici.fino(n);
    }
}
