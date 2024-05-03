package com.moviebooking;

import java.time.LocalDateTime;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Show {

	String hallId;
	Date date;
	LocalDateTime starttime;
	
}
