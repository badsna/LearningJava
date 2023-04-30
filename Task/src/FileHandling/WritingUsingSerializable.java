package FileHandling;

import java.io.*;

class Stds implements Serializable {
    int id;
    String name;

    public Stds(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Stds{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class WritingUsingSerializable {
    public static void main(String[] args) {
        Stds student=new Stds(1,"badsna");
        Stds student1=new Stds(2,"shrestha");
        try{
            FileOutputStream fileOutputStream=new FileOutputStream("F:\\Intern\\leran\\stds.txt");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);
            objectOutputStream.writeObject(student1);
            objectOutputStream.flush();
            objectOutputStream.close();

            FileInputStream fileInputStream=new FileInputStream("F:\\Intern\\leran\\stds.txt");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
           Stds c;
           while (true){
               try{
                   c=(Stds)objectInputStream.readObject();
                   System.out.println(c);
               }catch (EOFException e){
                   break;
               }
           }
        }catch (Exception e){
            e.printStackTrace();
            //System.out.println(e);
        }

    }
}
