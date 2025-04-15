package com.capgemini.beans.annotation.spel;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Leader {

	private int regNo;
	private String name;
	private int age;
	
	@Value("#{address.addrCity}")
	private String myCity;
	
	@Value("#{address.stateList[0]}")
	private String myState;
	
	@Value("#{address.addrPhNo}")
	private int myPH;

	@PostConstruct
	public void initialise() {
		this.regNo=6;
		this.name="amar kant tripathy";
		this.age=56;
	}
	
	public String getMyCity() {
		return myCity;
	}

	public void setMyCity(String myCity) {
		this.myCity = myCity;
	}

	public String getMyState() {
		return myState;
	}

	public void setMyState(String myState) {
		this.myState = myState;
	}

	public int getMyPH() {
		return myPH;
	}

	public void setMyPH(int myPH) {
		this.myPH = myPH;
	}

	
	
	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
}
