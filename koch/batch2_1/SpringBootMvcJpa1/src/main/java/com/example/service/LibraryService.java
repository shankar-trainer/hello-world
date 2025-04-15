package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.LibraryDao;
import com.example.exception.LibraryException;
import com.example.model.Library;

@Service
public class LibraryService {

	@Autowired
	private LibraryDao dao;

	public Library addLibrary(Library library) {
		Optional<Library> byId = dao.findById(library.getLibraryId());
		if (byId.isEmpty())
			return dao.save(library);
		else if (byId.isPresent())
			throw new LibraryException("library object with id already present");
		return null;

	}
	
	public Library updateLibrary(Library library) {
		Optional<Library> byId = dao.findById(library.getLibraryId());
		if (byId.isEmpty())
		{
			throw new LibraryException("library id  is not present");
		}	
		else if (byId.isPresent()) {
			return dao.save(library);
		}
		return null;
	}

	public List<Library> getAllLibrary() {
		if(dao.findAll().isEmpty()) {
			throw new LibraryException("library is empty");
		}
		else 
			return dao.findAll();
	}

}
