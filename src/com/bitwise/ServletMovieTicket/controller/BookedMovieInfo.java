package com.bitwise.ServletMovieTicket.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BookedMovieInfo")
public class BookedMovieInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BookedMovieInfo() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String customerName = request.getParameter("cname");
		String customerAddress = request.getParameter("caddr");
		String seats = request.getParameter("seat");
		int requiredSeats = Integer.parseInt(seats);
		String movieShow = request.getParameter("addedmovies");
		String date = request.getParameter("date");
		PrintWriter out = response.getWriter();

		if (customerName != null && customerAddress != null && date != null) {
			if (((MoviesInfo) request.getSession(false).getAttribute("mo")).bookingData(customerName, customerAddress,
					requiredSeats, movieShow, date)) {
				out.write("SuccessFully Added");
				response.setContentType("text/html");
				request.getRequestDispatcher("displayBookingHistory.jsp").include(request, response);

			} else {
				out.write(" Canot be added");
				response.setContentType("text/html");
				request.getRequestDispatcher("bookTicketIndex.jsp").include(request, response);
			}
		} else {
			out.println("<br><font>Invalid Data !!!</font><br>");
			response.setContentType("text/html");
			request.getRequestDispatcher("bookTicketIndex.jsp").include(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
