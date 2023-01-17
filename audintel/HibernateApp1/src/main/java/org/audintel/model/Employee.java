package org.audintel.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.mysql.cj.jdbc.MysqlDataSource;
@Entity
@Table(name = "employee1")
public class Employee {
	
	@Id
	@Column(length = 10, nullable = false, name = "employeeid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	
	@Column(length = 20, nullable = false, name="employee_name")
	private String empName;
	
	@Column(length = 20, nullable = false, name="employee_salary", precision = 2)
	private float empsalary;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpsalary() {
		return empsalary;
	}

	public void setEmpsalary(float empsalary) {
		this.empsalary = empsalary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empId, empName, empsalary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empId == other.empId && Objects.equals(empName, other.empName)
				&& Float.floatToIntBits(empsalary) == Float.floatToIntBits(other.empsalary);
	}

	
}
