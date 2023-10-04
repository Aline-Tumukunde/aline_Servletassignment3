package com.auca.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SignUpServlet", urlPatterns = { "/SignUpServlet" })
public class SignUpServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) {
        try {
            String email = req.getParameter("email");
            String password = req.getParameter("password");
            String username = req.getParameter("username");

            if (!email.isEmpty() && !password.isEmpty() && !username.isEmpty()) {
                PrintWriter out = res.getWriter();
                res.sendRedirect("/Servlet_Assignment3/index.html");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
