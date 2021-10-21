package org.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin {
	
	
	@Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  
	
    @Column(name="admin_id")  
    private int adminID;    
      
	@Column(name="admin_name")  
    public String adminName;  
	
    @Column(name="password")  
    public String password;  
      
    
    
    public Admin() {}

	
	public Admin(int adminID, String adminName, String password) {
		super();
		this.adminID = adminID;
		this.adminName = adminName;
		this.password = password;
	}


	


	public int getAdminID() {
		return adminID;
	}


	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}


	public String getAdminName() {
		return adminName;
	}


	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Admin [adminID=" + adminID + ", adminName=" + adminName + ", password=" + password + "]";
	}

	
	
    
    
}
    
