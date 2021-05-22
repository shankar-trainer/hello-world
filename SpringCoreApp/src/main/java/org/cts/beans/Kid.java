package org.cts.beans;

public class Kid {

	private int kid_Id;
	private String kid_Name;
	private String location;
	private Birthday bday;

	public int getKid_Id() {
		return kid_Id;
	}

	public void setKid_Id(int kid_Id) {
		this.kid_Id = kid_Id;
	}

	public String getKid_Name() {
		return kid_Name;
	}

	public void setKid_Name(String kid_Name) {
		this.kid_Name = kid_Name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Birthday getBday() {
		return bday;
	}

	public void setBday(Birthday bday) {
		this.bday = bday;
	}

	@Override
	public String toString() {
		return "Kid [kid_Id=" + kid_Id + ", kid_Name=" + kid_Name + ", location=" + location + ", bday=" + bday + "]";
	}

}
