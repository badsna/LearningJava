package Week3.Day11;
/*
   case I : waiting of main thread until completing child thread
    case II: Child thread has to wait until main thread completion
    case III: Both child and main thread wait for each other completion forever,the prg will be  stuck (this is something like deadlook)
    Case IV: If a thread calls join method on same thread itself, then the prg will be stuck like deadlock and in this case thread have to wait infinite time
            Inside Thread.currentThread().join()
            join will be executed by main thread
            Thread.currentThread mean main thread
   */
class MyThread5 extends Thread{
    //for case I:
   /* public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Badnsa");
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }


    }

    */

    //for case II:
    //here child thread calls join method on main thread object hence child thread  has to wait until completing main thread.
/*
    static Thread mt;
    //here run method will be called by child thread and run method have to call join method
    public void run(){
        try{
            mt.join();
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
        for (int i=0;i<10;i++){
            System.out.println("Badsna");

        }
    }

*/


    //for case III
    static Thread mt;
    public void run(){
        try{
            mt.join();
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
        for (int i=0;i<10;i++){
            System.out.println("Badsna");

        }
    }

}
public class PreventingExecution2 {
    public static void main(String[] args) throws InterruptedException {
        //for case I
        /*
        MyThread5 t=new MyThread5();
        t.start();
        //the blow code means main thread class the child thread's join method
        t.join(10000); //here main thread will go to waiting state
        //the below code will be executed only if child class finish its execution
        for (int i=0;i<10;i++){
            System.out.println("Shrestha");
        }

         */

        /*
        //for case II:

        MyThread5.mt=Thread.currentThread();
        MyThread5 t=new MyThread5();
        t.start();
        for (int i=0;i<10;i++){
            System.out.println("Shrestha");
            Thread.sleep(2000);
        }

         */


        MyThread5.mt=Thread.currentThread();
        MyThread5 t=new MyThread5();
        t.start();
        t.join();

        for (int i=0;i<10;i++){
            System.out.println("Shrestha");
            Thread.sleep(2000);
        }
    }

}
