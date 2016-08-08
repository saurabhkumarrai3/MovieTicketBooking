package com.bitwise.ServletMovieTicket.controller;

public class Movies {
	String moviename;
	String theatreName;
	int totalSeats;
	String startTime;
	String endTime;
	
	
	Movies(String movieName,String theatreName,int totalSeats,String startTime,String endTime){
		this.moviename=movieName;
		this.theatreName=theatreName;
		this.totalSeats=totalSeats;
		this.startTime=startTime;
		this.endTime=endTime;
	}


	public String getMoviename() {
		return moviename;
	}


	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}


	public String getTheatreName() {
		return theatreName;
	}


	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}


	public int getTotalSeats() {
		return totalSeats;
	}


	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}


	public String getStartTime() {
		return startTime;
	}


	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}


	public String getEndTime() {
		return endTime;
	}


	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}


	@Override
	public String toString() {
		return "Movies [moviename=" + moviename + ", theatreName=" + theatreName + ", totalSeats=" + totalSeats
				+ ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}
}
