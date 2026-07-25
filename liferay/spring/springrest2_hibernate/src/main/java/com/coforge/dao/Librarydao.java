package com.coforge.dao;


import java.util.List;

import com.coforge.model.Library;

public interface Librarydao {

	public boolean addLibrary(Library library);
	public boolean removeLibraryById(int id);
	public List<Library> showAll();
}