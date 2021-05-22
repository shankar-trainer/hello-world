package org.cts.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionDemo {

	private List<String> list1;
	private List<Employee> emp_list1;
	
	private Set<Employee> emp_set;
	
	private Map<Integer, Customer> custMap;

	public Map<Integer, Customer> getCustMap() {
		return custMap;
	}

	public void setCustMap(Map<Integer, Customer> custMap) {
		this.custMap = custMap;
	}

	public Set<Employee> getEmp_set() {
		return emp_set;
	}

	public void setEmp_set(Set<Employee> emp_set) {
		this.emp_set = emp_set;
	}

	public List<Employee> getEmp_list1() {
		return emp_list1;
	}

	public void setEmp_list1(List<Employee> emp_list1) {
		this.emp_list1 = emp_list1;
	}

	public List<String> getList1() {
		return list1;
	}

	public void setList1(List<String> list1) {
		this.list1 = list1;
	}
	
	
}
