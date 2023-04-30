package Week3.Day11;

class MyThread extends  Thread{
    public void run(){
        System.out.println("no args run");
    }
    public void run(int i){
        System.out.println("int args run");
    }
}
public class OverLoadingRunMethod {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();
        //thread class start methods always call no args run method
        //the other run method should be called explicitly
        t.run(5);
    }
}
