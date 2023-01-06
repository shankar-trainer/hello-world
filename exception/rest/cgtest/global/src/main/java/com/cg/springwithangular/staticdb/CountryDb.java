package com.cg.springwithangular.staticdb;

import java.util.ArrayList;
import java.util.List;

import com.cg.springwithangular.beans.Country;



public class CountryDb {
private static ArrayList<Country> countryList=new ArrayList<Country>();
	
	static{
		
			countryList.add(new Country("1001","India","3234567"));
			countryList.add(new Country("1002","Pakistan","64567"));
			countryList.add(new Country("1003","SriLanka","34567"));
			countryList.add(new Country("1004","China","454567"));
			countryList.add(new Country("1005","USA","134567"));
	}

	public static ArrayList<Country> getCountryList() {
		
		return countryList;
	}

	public static void setCountryList(List<Country> countryList) {
		
		CountryDb.countryList = (ArrayList<Country>) countryList;
	}
}
