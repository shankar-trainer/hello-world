package com.cg.springwithangular.beans;

public class Country {
	private String countryId;
	private String countryName;
	private String population;
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getPopulation() {
		return population;
	}
	public void setPopulation(String population) {
		this.population = population;
	}
	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryName="
				+ countryName + ", population=" + population + "]";
	}
	public Country(){
		
	}
	public Country(String countryId, String countryName, String population) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
		this.population = population;
	}

}
