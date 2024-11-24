package com.ticketbooking.app;

public class Movie {
	String screen_name;
	String movie_title;
	String show_time;
	String location; 

	public Movie(String movie_title, String screen_name, String show_time, String location) {
		this.movie_title = movie_title;
		this.screen_name = screen_name;
		this.show_time = show_time;
		this.location = location;
	}
	
	public String getScreenName() {
		return screen_name;
	}

	public String getMovieTitle() {
		return movie_title;
	}

	public String getShowTime() {
		return show_time;
	}

	public String getLocation() { 
        return location; 
    }
}