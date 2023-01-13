package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ManagerRepository;
import com.example.exception.ManagerException;
import com.example.model.Manager;

@Service
public class ManagerService {

	@Autowired
	private ManagerRepository dao;

	public List<Manager> getAllManager() throws ManagerException {
		if (dao.findAll().size() == 0)
			throw new ManagerException("manager list is empty");
		else
			return dao.findAll();
	}

	public Manager addManager(Manager manager) throws ManagerException {
		Optional<Manager> findById = dao.findById(manager.getManagerId());
		if (!findById.isPresent())
			return dao.save(manager);
		else
			throw new ManagerException("manager already present  ");
	}
	

	public Manager updateManager(Manager manager) throws ManagerException {
		Optional<Manager> findById = dao.findById(manager.getManagerId());
		if (findById.isPresent()) {
			return dao.save(manager);
		}
		else 
			throw new ManagerException("manager not present  ");
	}

	public Manager searchManager(int id) throws ManagerException {
		Optional<Manager> findById = dao.findById(id);
		if (findById.isPresent()) {
			return findById.get();
		}
		else 
			throw new ManagerException("manager not found ");
	}

	public Manager removeManager(int id) throws ManagerException {
		Optional<Manager> findById = dao.findById(id);
		if (findById.isPresent()) {
			Manager m1 = findById.get();
			dao.deleteById(id);
			return m1;
		}
		else
		throw new ManagerException("manager not present  ");
	}

}
