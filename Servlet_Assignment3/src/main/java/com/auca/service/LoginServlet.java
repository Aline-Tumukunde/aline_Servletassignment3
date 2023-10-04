package com.auca.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.Email;

@WebServlet(name = "LoginServlet", urlPatterns = { "/LoginServlet" })
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	String email = (String) request.getSession().getAttribute("email");
		String password = (String) request.getSession().getAttribute("password");
		PrintWriter out = response.getWriter();
	out.println("welcome  "+email+" your password is  "+password);
		request.getRequestDispatcher("home.html").forward(request,response);

    }
}
