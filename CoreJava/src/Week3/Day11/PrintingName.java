package Week3.Day11;
class MyThread2 extends Thread{
public void run(){
    System.out.println("Run is excuted by " + Thread.currentThread().getName());
}
}
public class PrintingName {
    public static void main(String[] args) {
        //to know current executing thread
       // System.out.println(Thread.currentThread().getName());
        MyThread2 t=new MyThread2();
        //every thread have a name generated by JVM or explicitly provided by programmer
      //  System.out.println(t.getName());

        //
//        Thread.currentThread().setName("badsna");
//        System.out.println(Thread.currentThread().getName());
//
//        t.setName("shrestha");
//        System.out.println(t.getName());
        t.start();
        System.out.println("Main is excuted by "+Thread.currentThread().getName());

    }
}
