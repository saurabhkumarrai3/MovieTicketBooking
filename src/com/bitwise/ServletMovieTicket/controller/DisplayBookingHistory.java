package com.bitwise.ServletMovieTicket.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DisplayBookingHistory")
public class DisplayBookingHistory extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DisplayBookingHistory() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		MoviesInfo mi = (MoviesInfo) request.getSession(false).getAttribute("mo");
		ArrayList<BookedMovies> list = (ArrayList<BookedMovies>) mi.getList1();

		Collections.sort(list, new Comparator<BookedMovies>() {
            public int compare(BookedMovies b1, BookedMovies b2) {
                return b1.getDate().compareTo(b2.getDate());
            }
        });

		out.println("<h2><b>Booking History</b></h2>");
		out.println("<br>");
		for (BookedMovies m : list) {
			System.out.println("test" + m.getCustomerName());
			out.println("Customer Name:" + m.getCustomerName());
			out.println("  Customer Address:" + m.getCustomerAddress());
			out.println("  Date :" + m.getDate());
			out.println("  Movie Show:" + m.getMovieShow());
			out.println("<br>");

		}
		response.setContentType("text/html");
		request.getRequestDispatcher("logout.jsp").include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
