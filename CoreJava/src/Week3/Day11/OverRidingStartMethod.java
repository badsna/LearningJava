package Week3.Day11;
 class MyThread1 extends Thread{
    public void start()
    {
        super.start();
        //after above line child and main thread will be there
        //main thread is responsible to execute start() followed by main()
        System.out.println("start method");
    }
    public void run(){
        System.out.println("run method");
    }
}
public class OverRidingStartMethod {
    public static void main(String[] args) {
MyThread1 t=new MyThread1();
t.start();
//start method will be called as normal method call and remaining code will be  executed
        System.out.println("main method");
    }
}
