package Week3.Day11;
class MyThread4 extends Thread{
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("child thread");
            Thread.yield();
            //main thread will get chance more number of time
            //and  chance of finishing main thread faster is high
            //some platforms won't provide proper support for yield method
        }
    }
}
public class PreventingExecution {
    public static void main(String[] args) {
        /*
        We can prevent thread execution by:
            1.yield();
                -if this method is called the current running thread is paused and give chance to thread having same priority
                -if there is  no waiting thread or have low priority then same thread can continue it execution
                -if multiple thread are waiting with same  priority, which thread will get chance cant be  expected, depends on TS
                -the left thread can be executed any time
                -public static native void yield();
                    //native means implemented in non java
                    //moves running state to ready/runnable state
            2. join();
                -if one thread wants to wait until another thread completes its execution then the waiting thread must call join method
                public final void join()
                public final void join(long ms)
                public final void join(long ms,int ns)
                     //here ns is int but ms is long cause the value of ns  range upto only certain vlaue
                     // when the value reaches the point value of ms will be incremented
              -when we are calling join there may be interruption so we should handle InterruptedException which is checked exception so we must compulsory handle it
               -Diagram in copy

            3. sleep()
            - If thread don't want to perform for certain amount of time then sleep method should be called
                public static native void sleep(long ms)
                public static native void sleep(long ms,int ns)
           -when sleep method is called it should have time cause it cant sleep forever
           -Every sleep method throws InterruptedException, which  is checked exception hence its should be handled
           -
           -
         */

        MyThread4 t=new MyThread4();
        t.start();
        for (int i=0;i<10;i++){
            System.out.println("main thread");
        }
    }
}
