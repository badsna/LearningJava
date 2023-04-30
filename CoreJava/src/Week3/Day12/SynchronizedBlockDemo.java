package Week3.Day12;

public class SynchronizedBlockDemo {
    public static void main(String[] args) {
        /*
        -if very few lines of code requires synchronization use synchronized block instead of declaring entire method as synchronized
        //Declaring
            -synchronized(this) //lock of current object{
            ------------------------------------
            ------------
            //if a thread got lockof  current object then only it is allowed to execute this area
            }

        //To get lock of particular object 'b'
         -synchronized(b) //lock of particular object b{
            ------------------------------------
            ------------
            //if a thread got lock of object 'b' then only it is allowed to execute this area
            }

       //To get class level lock
       synchronized(Display.class){
       --------------------
       }
       //if a thread get class level lock of display class then only it is allowed ot execute this area


         */
    }
}
