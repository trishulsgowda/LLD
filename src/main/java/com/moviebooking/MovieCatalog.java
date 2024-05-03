package com.moviebooking;

import java.util.ArrayList;
import java.util.List;

public class MovieCatalog {

	List<Movie> movies = new ArrayList<Movie>();
	
	public void setAvailableMovies(List<Movie> movie){
		this.movies.addAll(movies);
	}
	
	public void addMovieToCatalog(Movie movie){
		this.movies.add(movie);
	}
}
