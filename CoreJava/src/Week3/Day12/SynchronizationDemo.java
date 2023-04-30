package Week3.Day12;
class Display{
    public synchronized void wish(String name){
        for (int i=0;i<10;i++){
            System.out.println("good Morning: ");
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){

            }
            System.out.println(name);
        }
    }
}
class MyThread7 extends Thread{
    Display d;
    String name;
    MyThread7(Display d,String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
        //here thread is responsible to call wish method
        d.wish(name);
    }
}
public class SynchronizationDemo {
    public static void main(String[] args) {
        /*
        -Synchronizer is a modifier applicable for method and blocks but not for variables and class
        -If multiple thread are trying to operate  on java object simultaneously then we will get data inconsistency problem
        -To resolve data inconsistency problem we should go for synchronize keyword
        -If a method or block declared as synchronize then at a time only one thread is allowed to execute that method or block on the given object
        -Disadvantage: It increases waiting time of threads and creates performance problems hence if there is no specific req. then it is not recommended to use it
        -Internally synchronization is implemented by using lock, every object in java has a unique lock
        -Whenever we are using synchronize keyword then only lock concept will come  at the picture
        -If a thread wants to execute synchronize method on given object, first it has to get lock of that object.
        -Once thread get the lock then it is allowed to execute any synchronize method at that object.
        -After execution completes automatically thread release the lock
        -Acquiring and releasing of lock is taken care by JVM internally.
        - Wherever we are performing update operation where state of object changes it should be enclosed inside sync method
        -
         */
        Display d=new Display();
        MyThread7 t=new MyThread7(d,"badsna");
        MyThread7 t1=new MyThread7(d,"shrestha");
        t.start();
        t1.start();
    }
}
