package controller;

import model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.StudentService;

import java.util.List;

@Controller
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @RequestMapping("/hello")
    public void hello(){
        System.out.println("hello world");
    }

    @RequestMapping(value = "/getAllStudents", method = RequestMethod.GET)
    public void getAllStudents(){
        System.out.println(studentService.getAllStudents().toString());
    }

}
