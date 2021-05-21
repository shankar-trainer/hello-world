package com.cts.model;

import java.util.List;
import java.util.Set;

public class User {

	private int userId;
	private String userName;
	private String userLocation;
	private List<String> prdList;
	private Set<String> cityList;
	
	private Set<Book> bookList;
	
	public Set<Book> getBookList() {
		return bookList;
	}
	public void setBookList(Set<Book> bookList) {
		this.bookList = bookList;
	}
	public Set<String> getCityList() {
		return cityList;
	}
	public void setCityList(Set<String> cityList) {
		this.cityList = cityList;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserLocation() {
		return userLocation;
	}
	public void setUserLocation(String userLocation) {
		this.userLocation = userLocation;
	}
	public List<String> getPrdList() {
		return prdList;
	}
	public void setPrdList(List<String> prdList) {
		this.prdList = prdList;
	}
	
	
}
