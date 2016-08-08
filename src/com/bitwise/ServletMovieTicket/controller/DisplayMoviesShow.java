package com.bitwise.ServletMovieTicket.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DisplayMoviesShow")
public class DisplayMoviesShow extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DisplayMoviesShow() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		MoviesInfo mi = (MoviesInfo) request.getSession(false).getAttribute("mo");
		ArrayList<Movies> list = (ArrayList<Movies>) mi.getList();
		out.println("<h2><b>Movies Shows</b></h2>");
		out.println("<br>");
		for (Movies m : list) {
			System.out.println("test" + m.getMoviename());
			out.print(m.getMoviename());
			out.println("<br>");
		}
		response.setContentType("text/html");
		request.getRequestDispatcher("remove.html").include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
