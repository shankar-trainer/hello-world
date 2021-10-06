package org.com.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerUpdate {

	@Id
	private int id;
	private float max_amt_allowed;
	private boolean canOverride;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getMax_amt_allowed() {
		return max_amt_allowed;
	}
	public void setMax_amt_allowed(float max_amt_allowed) {
		this.max_amt_allowed = max_amt_allowed;
	}
	public boolean isCanOverride() {
		return canOverride;
	}
	public void setCanOverride(boolean canOverride) {
		this.canOverride = canOverride;
	}
	
	
	
}
