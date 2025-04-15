package com.cts.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

//@Component
@Component(value = "person1")

public class Person {

	private int personId;
	private String personName;
	private int personAge;
	private LocalDate dob;
	
	private List<String> bookList;
	public List<String> getBookList() {
		return bookList;
	}

	public void setBookList(List<String> bookList) {
		this.bookList = bookList;
	}

	public Set<String> getBikeSet() {
		return bikeSet;
	}

	public void setBikeSet(Set<String> bikeSet) {
		this.bikeSet = bikeSet;
	}

	public Map<Integer, String> getHomeMap() {
		return homeMap;
	}

	public void setHomeMap(Map<Integer, String> homeMap) {
		this.homeMap = homeMap;
	}

	private Set<String> bikeSet;
	private Map<Integer,String> homeMap;
	
	
	@PostConstruct
	public void init() {
		System.out.println("person init called ");
		this.personId=767676;
		this.personName="suresh sharma";
		this.personAge=35;
		this.dob=LocalDate.of(1992, 5, 25);
		
		this.bookList=new ArrayList<>();
		this.bookList.add("java beginner");
		this.bookList.add("sql beginner");
		this.bookList.add("java for dummies");
		this.bookList.add("java beginner");
		
		bikeSet=new HashSet<>();
		bikeSet.add("bullet");
		bikeSet.add("pulsar");
		bikeSet.add("yamaha");
		bikeSet.add("bullet");
		
		homeMap=new HashMap<>();
		homeMap.put(1001, "home1");
		homeMap.put(1002, "home1");
		homeMap.put(1001, "home3");
		homeMap.put(1004, "home1");
	}
	
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personAge=" + personAge + ", dob="
				+ dob + ", bookList=" + bookList + ", bikeSet=" + bikeSet + ", homeMap=" + homeMap + "]";
	}

	
	
	
	
}
