package org.com.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class User {

	private int id;
	private String name;
	private Set<String> bike;
	private List<String> car;
	private Map<Integer, String> mobile;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getBike() {
		return bike;
	}
	public void setBike(Set<String> bike) {
		this.bike = bike;
	}
	public List<String> getCar() {
		return car;
	}
	public void setCar(List<String> car) {
		this.car = car;
	}
	public Map<Integer, String> getMobile() {
		return mobile;
	}
	public void setMobile(Map<Integer, String> mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", bike=" + bike + ", car=" + car + ", mobile=" + mobile + "]";
	}
	
}
