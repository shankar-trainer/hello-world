package com.example.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Manager;

@RestController
public class ManagerController {

	@RequestMapping("/")
	public String hello() {
		return "hello world";
	}

	@RequestMapping("/welcome")
	public String show() {
		return "welcome to rest application";
	}

	@RequestMapping("/emp1")
	public Manager getEmployee() {
		return new Manager(565665, "chandan kumar", 45000);
	}

	@RequestMapping("/emps")
	public Manager[] getAllEmployee() {
		return new Manager[] { new Manager(565665, "chandan kumar", 45000), new Manager(565666, "vindo kumar", 85000),
				new Manager(565667, "balram kumar", 75000), new Manager(565669, "shivchandra kumar", 25000), };
	}

	List<Manager> managerList;

	public ManagerController() {
		managerList = new ArrayList<>(Arrays.asList(getAllEmployee()));
	}

	@RequestMapping("/managersearch/{id}")
	public Manager searchManagerById(@PathVariable("id") int id) {
		for (Manager m : managerList) {
			if (m.getManagerId() == id) {
				return m;
			}
		}
		return null;
	}

	@RequestMapping("/managersearch1/{id}")
	public ResponseEntity<Manager> searchManagerById1(@PathVariable("id") int id) {
		for (Manager m : managerList) {
			if (m.getManagerId() == id) {
				return new ResponseEntity<Manager>(m, HttpStatus.OK);
			}
		}
		return new ResponseEntity(id + " manager id  not found ", HttpStatus.NOT_FOUND);
	}

	//@RequestMapping("/emplist")
	@GetMapping("/emplist")
	public List<Manager> getAllEmployeeList() {
		//return Arrays.asList(getAllEmployee());
	   return  managerList; 
	}

	//@RequestMapping(name =    "/addmanager",method = RequestMethod.POST)
	@PostMapping("/addmanager")
	public List<Manager> addManager(@RequestBody Manager m) {
		managerList.add(m);
		return managerList;
	}
}
