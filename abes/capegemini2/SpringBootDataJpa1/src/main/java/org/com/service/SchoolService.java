package org.com.service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.com.dao.SchoolDao;
import org.com.model.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolService {

	@Autowired
	SchoolDao dao;

	public void addSchool(School school) {
		 School findById = dao.findById(school.getId());

		if (findById!=null)
			System.out.println("school id already present");
		else {
			dao.save(school);
			System.out.println("school added to database");
		}
	}

	public void searchBySchoolName(String name) {

		List<School> findBySchool_name = dao.findByName(name);
		if (findBySchool_name.size() == 0 || findBySchool_name == null)
			System.out.println("school not found");
		else {
			System.out.println("school found");
			findBySchool_name.forEach(System.out::println);
		}
	}

	public void searchBySchoolId(int id) {
		if (dao.findById(id) == null)
			System.out.println("scholl not found by id ");
		else
			System.out.println("School found byId \n" + dao.findById(id));
	}

	public void showAllSchool() {
		Iterable<School> findAll = dao.findAll();
		System.out.println("all schools");
		for (School school : findAll) {
			System.out.println(school);
		}
	}

	public void searchBySchoolNameOrderById(String name) {
		List<School> findByschool_name = dao.findByNameOrderById(name);
		if (findByschool_name.size() == 0 || findByschool_name == null)
			System.out.println("school not found");
		else {
			System.out.println("school found");
			findByschool_name.forEach(System.out::println);
		}
	}
	
	public void sortBySchoolName() {
		System.out.println("\nsorted by name \n");
		dao.sortByName().forEach(System.out::println);
	}
	
	public void totalNoOfSchool() {
	  System.out.println(" Total no of school is "+dao.no_of_all_school());
	}
}
