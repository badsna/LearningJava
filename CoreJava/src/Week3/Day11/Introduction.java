package Week3.Day11;

public class Introduction {
    public static void main(String[] args) {
        /*
            ####Multitasking####
                -Excuting several task simultaneously
                1. ProcessBased
                    Executing several task simultaneously where each task is separate independent part of different prg
                    Best suitable at OS level
                    Context switching is costly
                    For every process several address space is present
                    EG:
                        While writing java prg in editor we can listen songs from same system

                 2. Thread-Based
                    Executing several task simultaneously where each task is separate independent part of same prg
                    Each independent part is called thread or flow of execution
                    Best suitable at programmatic level

                -to increase performance by reducing response time of process
                -the main imp application areas of multithreading are:
                    -to develop multimedia graphics
                    -to develop animations,video games
                    -to develop webservers and application servers


                    $$$$$$$$$$$ways to define a thread$$$$$$
                    1. By extending Thread class
                    -Defining a thread
                       class MyThread extends Thread{
                       //overriding the method
                          public void run(){
                                // task  (known as job of thread)
                           }
                       }
                     -Start the thread
                        -By default there is one default thread that is main thread
                        -create MyThread object
                            MyThread k=new myThread(); //instantiation of  thread
                            k.start();    //starting of thread
                            //yesley thread class ko  start lai call garxa internally and tesley run call garxa
                            //k.run() garda ne hunxa but differnce is
                            //after start there will be two thread

                    a. Case I:Thread Scheduler
                        -part of JDM
                        -responsible to schedule thread execution
                        -but order cant be defined

                    b. Case II: start() vs run()
                       -run ley chai normal method call garya jasto garxa by main thread hence output is always same
                       -start ley chai new thread banauxa by create new separate thread who is resopnsibel for execution of run

                    c. Case III: Importance of thread class start method
                        -start(){
                            i.register this thread with thread scheduler
                            ii. perform all other mandatory activities
                            ii. invoke run();
                            }
                         -Without executing thread class start method there is no chance of  starting new thread  in java due to this thread clas start method is considered as heart of multi thread

                   d. Case IV: overloading of run method
                    -Overloading of run method is possible which is explained in Coding

                   e. Case V: if we are not overriding run method
                        -thread class run method will be implemented which has empty implementation
                        -no output
                        -if we are not overriding run method, dont go for multithreading concept

                   f. Case VI:Overriding of start method
                        -it is not recommended to override start method otherwise dont go for multithreading concept

                   g. Case VII: calling both thread class start and overriding start
                   h. Case VIII:  life cycle of thread
                            i.new/born  //mythread t=new mythread();
                            ii.read/runnable //t.start();
                            iii.running        //if TS allocates process
                            iv.dead  //if run() method completes

                   i. Case IX:Runtime Exception
                        -if thread restart its lifecycle after starting life cycle it  will get IllegalThreadStateException




                    2. By implementing Runnable interface
                        -java.lang
                        -it contains only one method run method
                        defining a thread
                        class MyRunnable implements Runnable{
                        public void run(){
                        //task
                        }}

                        class ThreadDemo{
                        public static void main(){
                        myRunnable r=new myRunnable();
                        Thread t=new Thread(r); //here r is known as target
                        t.start();
                        }}

                        For Case Study
                                MyRunnable r=new Runnable();
                                Thread t1=new Thread();
                                Thread t2=new Thread(r);
                       Case I: t1.start();
                            //new thread is made which is responsible to execute thread class run method which have empty implementation

                       Case II: t1.run();
                            //no new thread will be created and run() will be call as normal run()

                        Case III: t2.start();
                            //new thread will be created and myRunnable run method will be executed

                       Case IV: t2.run();
                            //myRunnable run() will be executed as normal method;

                       Case V: r.start();
                            //no start in MyRunnable throws RE: cannot find symbol
                                                                symbol: methods start() location class MyRunnable

                       Case VI: r.run();
                        //just like normal call


            NOTE: implements is recommended
                   In first approach extending other class is not possible


            Thread class Constructor
            1. Thread t=new Thread();
            2. Thread t=new Thread(Runnable r);
            3. Thread t=new Thread(String name);
            4. Thread t=new Thread(Runnable r, String name);
            5. Thread t=new Thread(threadGroup g,String name);
            6. Thread t=new Thread(ThreadGroup g,Runnable r);
            7. Thread t=new Thread(ThreadGroup g,Runnable r,String name);
            8. Thread t=new Thread(ThreadGroup g,Runnable r,String name, long stacksize );




         */
    }
}
