package org.com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Work {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int work_id;
	private String work_name;
	private float work_cost;
	
	@ManyToOne
	private Leader leader;
	
	
	public Leader getLeader() {
		return leader;
	}
	public void setLeader(Leader leader) {
		this.leader = leader;
	}
	public int getWork_id() {
		return work_id;
	}
	public void setWork_id(int work_id) {
		this.work_id = work_id;
	}
	public String getWork_name() {
		return work_name;
	}
	public void setWork_name(String work_name) {
		this.work_name = work_name;
	}
	public float getWork_cost() {
		return work_cost;
	}
	public void setWork_cost(float work_cost) {
		this.work_cost = work_cost;
	}
	@Override
	public String toString() {
		return "Work [work_id=" + work_id + ", work_name=" + work_name + ", work_cost=" + work_cost + "]";
	}
	
	
	
}
