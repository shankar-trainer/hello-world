package org.com.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Leader {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int leader_id;
	private String leader_name;
	private String leader_location;
	
	@OneToMany(mappedBy = "leader")
//	@JoinColumn(name="wid")
	private List<Work> list_work;

	public int getLeader_id() {
		return leader_id;
	}

	public void setLeader_id(int leader_id) {
		this.leader_id = leader_id;
	}

	@Override
	public String toString() {
		return "Leader [leader_id=" + leader_id + ", leader_name=" + leader_name + ", leader_location="
				+ leader_location + ", list_work=" + list_work + "]";
	}

	public String getLeader_name() {
		return leader_name;
	}

	public void setLeader_name(String leader_name) {
		this.leader_name = leader_name;
	}

	public String getLeader_location() {
		return leader_location;
	}

	public void setLeader_location(String leader_location) {
		this.leader_location = leader_location;
	}

	public List<Work> getList_work() {
		return list_work;
	}

	public void setList_work(List<Work> list_work) {
		this.list_work = list_work;
	}
	
	
	
	
	
	
	
	
	
}
