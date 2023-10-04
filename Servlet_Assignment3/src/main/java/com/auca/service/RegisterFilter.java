package com.auca.service;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RegisterFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
	  	HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        String firstname =request.getParameter("firstName");
		 String lastname =request.getParameter("lastName");
		 String address =request.getParameter("address");
		 String dob =request.getParameter("dob");
		 String email =request.getParameter("email");
		 String phone = request.getParameter("phone");
		 String mothername  = request.getParameter("motherName");
		 String fathername = request.getParameter("fatherName");
		 String department = request.getParameter("department");
		 String certificate = request.getParameter("certificate");
		 String picture = request.getParameter("picture");
    	
		if(firstname.isBlank() ||lastname.isEmpty() && address.isBlank() || dob.isEmpty() ||email.isBlank() ||phone.isEmpty() && mothername.isBlank() || fathername.isEmpty()
				||department.isEmpty()){		
			httpResponse.sendRedirect("RegisterServlet");	
    	}
		else {
			
			HttpSession session = httpRequest.getSession();
			
            session.setAttribute("firstName", firstname);
            session.setAttribute("lastName", lastname);
            session.setAttribute("address", address);
            session.setAttribute("dob", dob);
            session.setAttribute("email", email);
            session.setAttribute("phone", phone);
            session.setAttribute("motherName", mothername);
            session.setAttribute("fatherName", fathername);
            session.setAttribute("department", department);
            session.setAttribute("certificate", certificate);
            session.setAttribute("picture", picture);
			
        System.out.println("Filter executing before SignUpServlet");

        chain.doFilter(request, response);

        System.out.println("Filter executing after SignUpServlet");
    }}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
