package com.moviebooking;

public abstract class Seat {

	int rate;
	int seatNumber;
	
	public int getRate(){
		return rate;
	}
	
	public abstract void setRate();
}
