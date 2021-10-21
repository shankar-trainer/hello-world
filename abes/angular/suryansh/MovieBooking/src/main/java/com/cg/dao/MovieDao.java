
package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entity.Movie;

public interface MovieDao extends JpaRepository<Movie, Integer>{

}
