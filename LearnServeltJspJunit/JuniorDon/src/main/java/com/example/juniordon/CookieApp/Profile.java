package com.example.juniordon.CookieApp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/profile")
public class Profile extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

       // request.getRequestDispatcher("html/link.html").include(request, response);
        List<Employee> list = null;
        try {
            list = EmployeeDao.getAllEmployee();
            out.print("<table border=1 width='100%'>");
            out.print("<tr>\n" +
                    "        <th>ID</th>\n" +
                    "        <th>Name</th>\n" +
                    "        <th>Password</th>\n" +
                    "        <th>Email</th>\n" +
                    "        <th>Country</th>\n" +
                    "    </tr>");
            for (Employee employee : list) {
                out.print(
                        "<tr><td>" + employee.getId() + "</td><td>"
                                + employee.getName() + "</td><td>" +
                                employee.getPassword() + "</td><td>"
                                + employee.getEmail() + "</td><td>"
                                + employee.getCountry() + "</td></tr>"
                );
                out.print("</table>");
                out.close();
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



        }
    }

