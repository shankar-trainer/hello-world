package com.coforge.dao;

import com.coforge.model.Library;

public interface Librarydao {

	public boolean addLibrary(Library library);
	public boolean removeLibraryById(int id);
	public boolean showAll();
}
