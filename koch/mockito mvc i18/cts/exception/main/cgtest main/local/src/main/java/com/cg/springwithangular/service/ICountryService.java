package com.cg.springwithangular.service;

import java.util.List;

import com.cg.springwithangular.beans.Country;



public interface ICountryService {
	public List<Country> getAllCountries();
	public void addCountry(Country country);
	public Country deleteCountry(int id);
	public Country searchCountry(int id);
}
