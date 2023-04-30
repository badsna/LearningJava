package com.example.juniordon.Login;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/login")
public class login extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter  out=response.getWriter();

        String n= request.getParameter("username");
        String  password=request.getParameter("password");
            if(password.equals("Badsna")){
               response.sendRedirect("/Login/welcomePage");
            }
            else {

               response.sendRedirect("/file/LoginForm.html");
        }



    }
}
