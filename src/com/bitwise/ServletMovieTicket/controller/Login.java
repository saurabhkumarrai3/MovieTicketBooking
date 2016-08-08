package com.bitwise.ServletMovieTicket.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

// @WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		HttpSession session = request.getSession(true);
		String sid = session.getId();
		System.out.println(sid);
		session.setAttribute("name", request.getParameter("name"));
		session.setAttribute("sid", sid);

		session.setMaxInactiveInterval(2 * 60);

		if (session.isNew()) {
			MoviesInfo mi = new MoviesInfo();
			session.setAttribute("mo", mi);
			out.println("<br><h1> Login </h1>");
			out.print("<br> <font> logged in!</font>");
			out.print("<br><br>Welcome, " + session.getAttribute("name"));
			response.setContentType("text/html");
			request.getRequestDispatcher("addMoviesShow.html").include(request, response);
		} else {
			out.println("<br><h1> Welcome Back</h1> " + session.getAttribute("name"));
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
