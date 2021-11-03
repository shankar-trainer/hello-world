package org.capg;

public class Kid {
	private int kidRegNo;
	private String kidName;
	private int kidAge;

	private Birthday bday;
	
	public void cleanup() {
		System.out.println("destroy called ");
		kidAge=0;
		kidName=null;
		kidRegNo=0;
		bday.setDay(0);
		bday.setMonth(0);
		bday.setYear(0);
	
	}
	public void init() {
		System.out.println("init called ");
		kidAge=1;
		kidName="munnu";
		kidRegNo=77887;
		bday.setDay(1);
		bday.setMonth(10);
		bday.setYear(2020);
	}

	public int getKidRegNo() {
		return kidRegNo;
	}

	public void setKidRegNo(int kidRegNo) {
		this.kidRegNo = kidRegNo;
	}

	public String getKidName() {
		return kidName;
	}

	public void setKidName(String kidName) {
		this.kidName = kidName;
	}

	public int getKidAge() {
		return kidAge;
	}

	public void setKidAge(int kidAge) {
		this.kidAge = kidAge;
	}

	public Birthday getBday() {
		return bday;
	}

	public void setBday(Birthday bday) {
		this.bday = bday;
	}

}
