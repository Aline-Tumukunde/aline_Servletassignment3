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

public class LoginFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
	    String passwd = "12345";
	    String emaily = "tumukunde250@gmail.com";

		HttpServletResponse res = (HttpServletResponse)response;
    	HttpServletRequest req = (HttpServletRequest)request;
    	String password = req.getParameter("password");
    	String email = req.getParameter("email");
    
    	 if (email.equals(emaily) && password.equals(passwd)) {
    	        HttpSession session = req.getSession();
    	        session.setAttribute("password", password);
    	        session.setAttribute("email", email);
    	        chain.doFilter(req, res);
    	}
    	else {
    	    req.setAttribute("error", "Invalid email or password. Please try again.");
            req.getRequestDispatcher("forgotpassword.html");
    	}
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
