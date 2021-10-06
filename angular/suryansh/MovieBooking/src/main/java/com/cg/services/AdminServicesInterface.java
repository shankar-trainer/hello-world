package com.cg.services;

import com.cg.entity.Movie;
import com.cg.entity.Theater;

public interface AdminServicesInterface {

	// Account validate(String uname, String pass);
	public Theater addTheater(Theater theater);

	public Movie addMovie(Movie theater);

	public String deleteTheater(int theaterId);

	public Theater findTheaterById(int theaterId);

	//Needs to be completed

}