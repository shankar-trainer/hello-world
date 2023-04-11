package org.audintel.model;

import lombok.Data;

@Data
public class Address {
	private long addrId;
	private String addrSector;
	private String addrCity;
	private String addrState;
	private String addrCountry;
	private long addrPin;
}
