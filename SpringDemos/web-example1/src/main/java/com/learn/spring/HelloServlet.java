package com.learn.spring;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class HelloServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("In Service");

        res.setContentType("text/html");

        PrintWriter pw=res.getWriter();
        pw.println("<h1><b>Hello from service </b></h1>");

    }


}
