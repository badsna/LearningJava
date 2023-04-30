package com.example.juniordon.CookieApp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/loginservlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        request.getRequestDispatcher("html/link.html").include(request,response);
        String name=request.getParameter("name");
        String password=request.getParameter("password");
        if(password.equals("admin123")){
            out.println("you are successfuly logged in!");
            out.println("<br>Welcome, "+name);

            Cookie ck=new Cookie("name", name);
            response.addCookie(ck);
        }
        else {
            out.print("sorry,username  or password error!");
            request.getRequestDispatcher("html/login.html").include(request,response);
        }
        out.close();
    }
}
