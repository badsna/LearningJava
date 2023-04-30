package com.example.jspcurd.dao;

import com.example.jspcurd.bean.Student;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection con = null;
        Class.forName("org.postgresql.Driver");
        con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Student", "postgres", "By@$hna%");
        return con;
    }

//    public static List<Student> getAllStudents() throws SQLException, ClassNotFoundException {
//        List<Student> list=new ArrayList<Student>();
//           Connection  con=getConnection();
//            PreparedStatement ps= con.prepareStatement("select * from student");
//            ResultSet rs=ps.executeQuery();
//            while (rs.next()) {
//                Student student = new Student();
//                student.setStd_id(rs.getInt("std_id"));
//                student.setStd_name(rs.getString("std_name"));
//                student.setCountry(rs.getString("country"));
//                student.setGender(rs.getString("gender"));
//                student.setHobbies(rs.getString("hobbies"));
//
//                list.add(student);
//            }
//            return list;
//
//    }

    public static int save(Student s) throws SQLException, ClassNotFoundException, FileNotFoundException {
        int status=0;
        Connection con=getConnection();
        System.out.println(s.getHobbies());
        System.out.println(s.getGender());
        PreparedStatement ps=con.prepareStatement("insert into student(std_name,country,gender,hobbies,photo) values(?,?,?,?,?)");
        ps.setString(1,s.getStd_name());
        ps.setString(2,s.getCountry());
        ps.setString(3,s.getGender());
        ps.setString(4,s.getHobbies());
        File photo=new File("C:\\Users\\DELL\\Pictures\\Screenshots\\Screenshot (2)");
        try (FileInputStream fin=new FileInputStream(photo)){
            ps.setBinaryStream(5, fin,(int)photo.length());


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        status=ps.executeUpdate();
        return status;
    }
}
