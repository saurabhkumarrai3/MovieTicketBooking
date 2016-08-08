package com.bitwise.ServletMovieTicket.model;

import java.util.ArrayList;
import java.util.List;

public class MoviesInfo {

	List<Movies> list = new ArrayList<>();
	List<BookedMovies> list1 = new ArrayList<>();

	public List<BookedMovies> getList1() {
		return list1;
	}

	public void setList1(List<BookedMovies> list1) {
		this.list1 = list1;
	}

	public boolean moviesData(String movieName, String theatreName, int totalSeats, String startTime, String endTime) {

		if (list.size() < 2) {
			Movies m = new Movies(movieName, theatreName, totalSeats, startTime, endTime);
			System.out.println(m.toString());
			list.add(m);
			System.out.println("Count: " + list.size());
			return true;
		}

		else {
			return false;
		}
	}

	public boolean bookingData(String customerName, String customerAddress, int seats, String movieShow, String date) {

		if (list1.size() < 2) {
			BookedMovies m = new BookedMovies(customerName, customerAddress, movieShow, date, seats);
			System.out.println(m.toString());
			list1.add(m);
			System.out.println("Count: " + list.size());
			return true;
		}

		else {
			return false;
		}
	}

	public List<Movies> getList() {
		return list;
	}

	public void setList(List<Movies> list) {
		this.list = list;
	}

	public void display() {

		for (Movies m : list) {
			System.out.println("test" + m.getMoviename());
		}

	}

	public void removeItem(String moviesName) {
		List<Movies> list1 = new ArrayList<>();
		for (Movies m1 : list) {
			if (!(m1.getMoviename().equals(moviesName))) {
				System.out.println(moviesName);
				list1.add(m1);
			}
			for (Movies m : list1) {
				System.out.println("test" + m.getMoviename());
			}
			list = list1;
			for (Movies m : list) {
				System.out.println("test" + m.getMoviename());
			}
		}
	}
}