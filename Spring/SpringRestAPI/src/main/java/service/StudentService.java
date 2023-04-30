package service;

import model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
  private  List<Student> studentList=new ArrayList<Student>();

  public StudentService() {
       studentList.add(new Student(1, "Badsna", "Nala"));
       studentList.add(new Student(2, "adsna", "ala"));
       studentList.add(new Student(3, "dsna", "la"));
   }

   public  List<Student> getAllStudents(){
        return studentList;
   }

}
