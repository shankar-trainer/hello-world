
package com.cg.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.ScreenDao;
import com.cg.entity.Screen;
@Service
@Transactional
public class ScreenServices implements ScreenServiceInterface{
	
	@Autowired
	private ScreenDao dao ;

	@Override
	public String deleteScreen(int id) {
		Optional<Screen> screen = dao.findById(id) ;
		if(!screen.isPresent() || screen == null) {
			return "No Screen found for given id!" ;
		}
		dao.deleteById(id);
		return "Screen Deleted Successfully!";
	}
}
