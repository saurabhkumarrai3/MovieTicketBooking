package com.bitwise.ServletMovieTicket.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RemoveMovieShow")
public class RemoveMovieShow extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public RemoveMovieShow() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MoviesInfo movie=(MoviesInfo) request.getSession(false).getAttribute("mo");
		movie.removeItem(request.getParameter("mname"));
		response.setContentType("text/html");
		request.getRequestDispatcher("DisplayMoviesShow").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
