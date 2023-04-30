package com.example.juniordon.CookieApp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {


    public static List<Employee> getAllEmployee() throws ClassNotFoundException, SQLException {
        List<Employee> list=new ArrayList<Employee>();
        Class.forName("com.postgres.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:postgresql://localhost:5432/employee","postgres","By@$hna%");
        Statement smt=con.createStatement();

        PreparedStatement stmt=con.prepareStatement("SELECT * from Employee");
        ResultSet rs= stmt.executeQuery();
        Employee employee=new Employee();
        while (rs.next()){

           employee.setId(rs.getInt(1));
            employee.setName(rs.getString(2));
            employee.setPassword(rs.getString(3));
            employee.setEmail(rs.getString(4));
            employee.setCountry(rs.getString(5));
            list.add(employee);
        }
        con.close();
        return list;
    }

}
