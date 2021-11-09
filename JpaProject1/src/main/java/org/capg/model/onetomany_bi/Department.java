package org.capg.model.onetomany_bi;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int deptNo;
	private String deptName;

	@OneToMany(mappedBy = "department")
	private Set<Employee1> employee;
	
	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public Set<Employee1> getEmployee() {
		return employee;
	}

	public void setEmployee(Set<Employee1> employee) {
		this.employee = employee;
	}


	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}
