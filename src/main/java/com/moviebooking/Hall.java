package com.moviebooking;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Hall {

	String hallId;
	Seat[] seats = new Seat[10];
}
