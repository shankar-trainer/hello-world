package org.com.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {

	private int person_id;
	private String person_name;
	private String person_location;
	
	private List<String> carList;
	private Set<String> mobileSet;
	private Map<String, String> stateCapital;
	private Properties countryCapital;
	
	public Properties getCountryCapital() {
		return countryCapital;
	}
	public void setCountryCapital(Properties countryCapital) {
		this.countryCapital = countryCapital;
	}
	
	
	public Map<String, String> getStateCapital() {
		return stateCapital;
	}
	public void setStateCapital(Map<String, String> stateCapital) {
		this.stateCapital = stateCapital;
	}
	public Set<String> getMobileSet() {
		return mobileSet;
	}
	public void setMobileSet(Set<String> mobileSet) {
		this.mobileSet = mobileSet;
	}
	 
	@Override
	public String toString() {
		return "Person [person_id=" + person_id + ", person_name=" + person_name + ", person_location="
				+ person_location + ", carList=" + carList + ", mobileSet=" + mobileSet + "]";
	}
	public int getPerson_id() {
		return person_id;
	}
	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}
	public String getPerson_name() {
		return person_name;
	}
	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}
	public String getPerson_location() {
		return person_location;
	}
	public void setPerson_location(String person_location) {
		this.person_location = person_location;
	}
	public List<String> getCarList() {
		return carList;
	}
	public void setCarList(List<String> carList) {
		this.carList = carList;
	}
	
	
	
}
