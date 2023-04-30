package Week3.Day11;
class MyThread3 extends Thread{
public void run(){
    for (int i=0;i<10;i++){
        System.out.println("child thread");
    }
}
}
public class ThreadPriorites {
    public static void main(String[] args) {
        /*
           - The priorites is always 1-10 not 0-10.
           - min_priority=0
           -max_priority=10
           -norm_priority=5
           -Thread scheduler will use priorities while allocating process.
           -the thread having highest will get chance first
           -in same priority, we can except exact execution order, it depends on TS
           -default for only for main thread is 5
           -for other thread default will be inherited from parent to child

           public final int getPriority()
           public final void setPriority(int p)
                p must be 1-10 range else RE:IllegalArgumentException
         */
       // System.out.println(Thread.currentThread().getPriority());
       // Thread.currentThread().setPriority(15); //throws RE

        MyThread3 t=new MyThread3();
        t.setPriority(10);
        //no exact order cause some platform dont provide priority support
        t.start();
        //main is the parenteof mythread3 beacuse main class excutes this line
        for (int i=0;i<10;i++){
            System.out.println("main thread");
        }

    }
}
