package com.bitwise.ServletMovieTicket.model;

public class BookedMovies {
	String customerName;
	String customerAddress;
	int seats;
	String movieShow;
	String date;
	
	public BookedMovies(String customerName2, String customerAddress2, String movieShow2, String date2, int seats2) {
		this.customerName=customerName2;
		this.customerAddress=customerAddress2;
		this.seats=seats2;
		this.movieShow=movieShow2;
		this.date=date2;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public String getMovieShow() {
		return movieShow;
	}
	public void setMovieShow(String movieShow) {
		this.movieShow = movieShow;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "BookedMovies [customerName=" + customerName + ", customerAddress=" + customerAddress + ", seats="
				+ seats + ", movieShow=" + movieShow + ", date=" + date + "]";
	}
	
}
