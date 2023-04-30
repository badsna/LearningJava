package com.example.springframework.ForQualifier;

public class Student {
    private int studentId;
    private String studentName;


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }



    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;

    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                '}';
    }

    public Student() {
        super();
    }


}