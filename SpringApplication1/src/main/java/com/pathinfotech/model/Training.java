package com.pathinfotech.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Training {

	private int id;
	private String  name;
	private float cost;
	private List<String> list;
	private Set<String> locationset;
	private Map<String,String> capitalStateMap;

	public Map<String, String> getCapitalStateMap() {
		return capitalStateMap;
	}

	public void setCapitalStateMap(Map<String, String> capitalStateMap) {
		this.capitalStateMap = capitalStateMap;
	}

	public Set<String> getLocationset() {
		return locationset;
	}

	public void setLocationset(Set<String> locationset) {
		this.locationset = locationset;
	}

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

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
	
	
	
}
