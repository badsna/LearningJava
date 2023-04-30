package com.example.juniordon;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;
//@WebServlet(name = "helloServlet", value = "/generic-servlet")
@WebServlet(name = "genericServlet" , value = "/generic-servlet")
public class GenericServletDemo extends GenericServlet {
    //httpServlet lai extends garda  chai doGet hunxa method  ko name
    public void service(ServletRequest res, ServletResponse resp) throws IOException {
        resp.setContentType("text/html"); //setting the content type
        PrintWriter out=resp.getWriter(); //get the stream to write the data
        //writing html in the stream
        out.print("<html><body>");
        out.print("<b>Hello Genric Servlet</b>");
        out.print("</body></html>");
        //closing the stream
        out.close();

    }
}
