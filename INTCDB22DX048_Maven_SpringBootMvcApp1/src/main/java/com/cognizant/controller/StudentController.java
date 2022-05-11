package com.cognizant.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cognizant.model.Student;

@Controller
@RequestMapping("/stud")
public class StudentController {

	@RequestMapping("/form")
	public String sendtoStudentForm(ModelMap map) {
		Student student = new Student();
		student.setRoll(null);
		student.setName(null);
		student.setSubject(null);
		map.addAttribute("student", student);
		return "StudentForm";
	}

	@RequestMapping("/SAction")
	public String sendtoStudentResult(@ModelAttribute("student") @Valid Student student, BindingResult result) {
		if (result.hasErrors())
			return "StudentForm";
		else
			return "StudentResult";
	}

}
