package Week3.Day11;

class MyThread6 extends Thread{
    //for how to interrupt
    /*
    public void run(){
            try{
                for(int i=0;i<10;i++) {
                    System.out.println("Badnsa");
                    Thread.sleep(2000);
                }
            }catch (InterruptedException e){
                System.out.println("I got interutted");
            }
        }

     */

    public void run(){
        for(int i=0;i<10;i++) {
            System.out.println("Badnsa");
        }
        System.out.println("I want to sleep");
        try{
                Thread.sleep(2000);

        }catch (InterruptedException e){
            System.out.println("I got interutted");
        }
    }
    }

public class PreventingExecution3  {
    public static void main(String[] args) throws InterruptedException {
       //Normal Sleep yo matra vaya pugyo
       /*
        for (int i=0;i<10;i++){
            System.out.println("slide_ "+i);
            Thread.sleep(5000);
            //1sec have 1000 ms
        }

        */

        /*
        //how a thread can interrupt another thread
        -Thread class contain interrupt method

  MyThread6 k=new MyThread6();
        k.start();
        k.interrupt(); //excuted by main thread(main thread  interrupts child thread
        System.out.println("End of main");


         */



        /*
        -check if child thread is in sleeping state or not before interrupting
        -interrupt method wont be wasted
        -if child thread is  not in sleeping state but main thread interrupts then

         */

        MyThread6 k=new MyThread6();
        k.start();
        k.interrupt(); //Here interrupt will wait
        System.out.println("End of main");

    }
}
