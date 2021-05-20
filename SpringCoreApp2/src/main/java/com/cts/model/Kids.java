package com.cts.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Lazy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;
//@Lazy(value = true)
public class Kids {

	private int kidsId;
	private String kidsName;
	private int kidsAge;
	
	
	@PostConstruct()
	public void kidInit() {
		kidsId=1;
		kidsName="muththu";
		kidsAge=4;
		System.out.println("kids init called ");
	}
	
	@PreDestroy
	public void kidDestroy() {
	  System.out.println("kids bean instance is destroyed ");
	}
	
	
	//@Autowired
	//@Qualifier("home2")
	

	//@Resource(name="home1")
	@Inject
	private Home home;
	
	
	public Home getHome() {
		return home;
	}

	public void setHome(Home home) {
		this.home = home;
	}

	public int getKidsId() {
		return kidsId;
	}
	
	@Required
	public void setKidsId(int kidsId) {
		this.kidsId = kidsId;
	}
	
	public String getKidsName() {
		return kidsName;
	}
	public void setKidsName(String kidsName) {
		this.kidsName = kidsName;
	}
	public int getKidsAge() {
		return kidsAge;
	}
	public void setKidsAge(int kidsAge) {
		this.kidsAge = kidsAge;
	}
	
	
}
