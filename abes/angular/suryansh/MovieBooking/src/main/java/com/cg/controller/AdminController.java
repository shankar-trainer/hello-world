package com.cg.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Movie;
import com.cg.entity.Screen;
import com.cg.entity.Theater;
import com.cg.services.MovieServices;
import com.cg.services.ScreenServiceInterface;
import com.cg.services.TheaterServiceInterface;
@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private TheaterServiceInterface theaterService ;
	
	@Autowired
	private MovieServices movieService ;
	
	@Autowired
	private ScreenServiceInterface screenService ;
	
	
	List<Movie> moviesList = new ArrayList<>();
	List<Screen> screenList = new ArrayList<>() ;
	
	@RequestMapping(value = "/theater/addTheater", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Theater addTheater(@RequestBody Theater theater) {
		return theaterService.addTheater(theater) ;
	}
	
	@RequestMapping(value = "/theater/{theaterId}", method = RequestMethod.DELETE)
	public String deleteTheater(@PathVariable("theaterId") Integer theaterId) {
		return theaterService.deleteTheater(theaterId) ;
	}
	
	@RequestMapping(value = "/movies/addMovie/{theaterId}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String addMovie(@RequestBody Movie movie,@PathVariable("theaterId") int theaterId) {
		Theater theater = theaterService.findTheaterById(theaterId) ;
		moviesList.add(movie) ;
		theater.setMovies(moviesList);
		return theaterService.updateTheater(theater) ;
	}
	
	@RequestMapping(value = "/movies/deleteMovie/{movieId}", method = RequestMethod.DELETE)
	public String deleteMovie(@PathVariable("movieId") Integer movieId) {
		return movieService.deleteMovie(movieId) ;
	}
	
	@RequestMapping(value = "/movies/addScreen/{theaterId}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String addScreen(@PathVariable("theaterId") int theaterId, @RequestBody Screen screen) {
		Theater theater = theaterService.findTheaterById(theaterId) ;
		screenList.add(screen) ;
		theater.setScreens(screenList);
		return theaterService.updateTheater(theater) ;
	}
	
	@RequestMapping(value = "/movies/deleteScreen/{screenId}", method = RequestMethod.DELETE)
	public String deleteScreen(@PathVariable("screenId") Integer screenId) {
		return screenService.deleteScreen(screenId) ;
	}
	
}