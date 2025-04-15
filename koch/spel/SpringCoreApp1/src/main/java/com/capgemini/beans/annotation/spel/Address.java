package com.capgemini.beans.annotation.spel;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class Address {

	private int addrId;
	private String addrCity;
	private String addrStreet;
	private List<String> stateList;
	private int addrPhNo;
	public List<String> getStateList() {
		return stateList;
	}

	public void setStateList(List<String> stateList) {
		this.stateList = stateList;
	}


	@PostConstruct
	public void init() {
		this.addrId = 88989;
		this.addrCity = "nagpur";
		this.addrStreet = "sector1";
		this.addrPhNo=676678686;
		stateList = new ArrayList<String>();
		stateList.add("delhi");
		stateList.add("maharastra");
		stateList.add("telengana");
		stateList.add("west bengal");
		stateList.add("andhra pardesh");
	}

	public int getAddrId() {
		return addrId;
	}

	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}

	public String getAddrCity() {
		return addrCity;
	}

	public void setAddrCity(String addrCity) {
		this.addrCity = addrCity;
	}

	public String getAddrStreet() {
		return addrStreet;
	}

	public void setAddrStreet(String addrStreet) {
		this.addrStreet = addrStreet;
	}

	public int getAddrPhNo() {
		return addrPhNo;
	}

	public void setAddrPhNo(int addrPhNo) {
		this.addrPhNo = addrPhNo;
	}

}
