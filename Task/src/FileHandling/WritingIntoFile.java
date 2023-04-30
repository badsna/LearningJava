package FileHandling;

import java.io.*;

class Student{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class WritingIntoFile {
    public static void main(String[] args) {
        Student student=new Student(1,"badsna");
        Student student1=new Student(2,"shrestha");
        try {
            FileWriter fileWriter=new FileWriter("F:\\Intern\\leran\\student.txt");
            fileWriter.write(student.id + " "+ student.name);
            fileWriter.append(student1.id + " "+ student1.name);
            fileWriter.close();
            FileReader fileReader=new FileReader("F:\\Intern\\leran\\student.txt");
            int c;
            while ((c=fileReader.read())!=-1){
                System.out.print((char) c);
            }


        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
