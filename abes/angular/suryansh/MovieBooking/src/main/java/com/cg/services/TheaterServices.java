
package com.cg.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional ;

import com.cg.dao.TheaterDao;
import com.cg.exceptions.*;
import com.cg.entity.Theater;

@Service
@Transactional
public class TheaterServices implements TheaterServiceInterface{
	
	@Autowired
	private TheaterDao dao ;
	
   
	@Override
	public Theater addTheater(Theater theater) {
		Optional<Theater> tId = dao.findById(theater.getTheaterId()) ;
		if(tId.isPresent()) {
			throw new ExistingException("Already Present") ;
		}
		return dao.save(theater) ;	
	}

	@Override
	public String deleteTheater(int id) {
		Optional<Theater> theater = dao.findById(id) ;
		if(!theater.isPresent() || theater == null) {
			return "No Theater Found By Given Id" ;
		}
		dao.deleteById(id);
		return "Theater Deleted Successfully!" ;
	}

	@Override
	public Theater findTheaterById(int theaterId) {
		Optional<Theater> t = dao.findById(theaterId) ;
		if(!t.isPresent() || t == null) {
			return null ;
		}
		Theater theater = t.get() ;
		return theater ;
	}

	@Override
	public String updateTheater(Theater theater) {
		dao.save(theater) ;
		return "Theater Updated!" ;
	}

}
