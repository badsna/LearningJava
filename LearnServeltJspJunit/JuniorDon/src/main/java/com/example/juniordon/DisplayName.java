package com.example.juniordon;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.PrimitiveIterator;

@WebServlet(name = "welcomeee", value = "/welcome")
public class DisplayName extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
 //req.getRequestDispatcher("src/main/webapp/htmlFiles/ServletRequestDemo.html").forward(req, res);

        //"name" vanya uta html ma vako name sanga match hunu parxa
        String name=req .getParameter("name"); //will return value
        pw.println("Welcome " +name);
        pw.close();
    }
}
