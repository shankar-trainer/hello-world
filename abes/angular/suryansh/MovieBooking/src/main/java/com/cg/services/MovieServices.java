package com.cg.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.MovieDao;
import com.cg.entity.Movie;

@Service
@Transactional
public class MovieServices implements MovieServiceInterface {

	@Autowired
	private MovieDao dao;

	@Override
	public String deleteMovie(int id) {
		Optional<Movie> movie = dao.findById(id);
		if (!movie.isPresent() || movie == null) {
			return "No movie found for given id!";
		}
		dao.deleteById(id);
		return "Movie Deleted Successfully!";
	}

}