package com.bitwise.ServletMovieTicket.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


//@WebFilter("/ValidatorFilter")
public class ValidatorFilter implements Filter {

    /**
     * Default constructor. 
     */
    public ValidatorFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html");
		UserData ud = new UserData();
		PrintWriter out = response.getWriter();

		String username = request.getParameter("name");
		String pass = request.getParameter("password");
		if (username != null && pass != null) {
			if (ud.returnKeyValue(username.toLowerCase(), pass.toLowerCase())) {
				chain.doFilter(request, response);
			} else {

				out.println("<br><font>Invalid Username or Password !!!</font><br>");
				response.setContentType("text/html");
				request.getRequestDispatcher("login.html").include(request, response);

			}
		} else {
			out.println("<br><font>Invalid Username or Password !!!</font><br>");
			response.setContentType("text/html");
			request.getRequestDispatcher("login.html").include(request, response);

		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
