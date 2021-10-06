package org.com.service;

import java.util.List;

import org.com.model.Admin;

public interface AdminService {
	
	public Admin findById(int id);
	public List<Admin>	findAll();
	public void save(Admin admin);
	
}
