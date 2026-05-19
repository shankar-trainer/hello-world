package org.montran.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity

@NamedQuery(name = "getall",query="from Library")
@NamedQuery(name = "getbyname",query="from Library where library_Name=?1")

public class Library {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int library_Reg_Id;
	
	private  String  library_Name;
	private  String  library_Location;
	private int no_of_Book;
	
	public int getLibrary_Reg_Id() {
		return library_Reg_Id;
	}
	public void setLibrary_Reg_Id(int library_Reg_Id) {
		this.library_Reg_Id = library_Reg_Id;
	}
	public String getLibrary_Name() {
		return library_Name;
	}
	public void setLibrary_Name(String library_Name) {
		this.library_Name = library_Name;
	}
	public String getLibrary_Location() {
		return library_Location;
	}
	public void setLibrary_Location(String library_Location) {
		this.library_Location = library_Location;
	}
	public int getNo_of_Book() {
		return no_of_Book;
	}
	public void setNo_of_Book(int no_of_Book) {
		this.no_of_Book = no_of_Book;
	}
	
	
	
	
}
