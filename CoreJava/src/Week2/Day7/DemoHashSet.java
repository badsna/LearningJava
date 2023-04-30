package Week2.Day7;

import java.util.*;

class Student{
    int age;
    String student_name;


    public Student(int age, String student_name) {
        this.age = age;
        this.student_name = student_name;

    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", student_name='" + student_name + '\'' +
                '}';
    }
    public int hashCode(){
        return age;
    }
    public boolean equals(Object o){
        if(o instanceof Student){

            Student s1=(Student) o;
            if(this.age==s1.age)
                return true;

        }
        return false;
    }
}
class DemoHashSet {
    public static void main(String[] args) {
        HashSet<Student> h=new HashSet<Student>();
        //here new object is being created so hash value are different so duplicate allowed
        Student s1=new Student(111,"badsna");
        Student s2=new Student(111,"badsn");
        Student s3=new Student(111,"bads");

        h.add(s1);
        h.add(s2);
        h.add(s3);

        Iterator iterator= h.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
