package blog.panditmandar.code.mvcapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import blog.panditmandar.code.mvcapp.model.Student;
import blog.panditmandar.code.mvcapp.service.StudentService;

@Controller
@RequestMapping("/")
public class AppController {

	@Autowired
	StudentService studentService;

	@Autowired
	MessageSource messageSource;

	/**
	 * This Method will list All existing Students
	 */
	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public ModelAndView welcome(ModelMap model) {
		ModelAndView mv = new ModelAndView();
		List<Student> list = studentService.listAllStudents();
		model.addAttribute("allstudents", list);
		mv.setViewName("allStudents");
		return mv;
	}

	/**
	 * This Method will provide way to Add New Student
	 */
	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	public String newStudentForm(ModelMap model) {
		Student newStudent = new Student();
		model.addAttribute("student", newStudent);
		model.addAttribute("edit", false);
		return "addStudentForm";
	}

	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public ModelAndView saveStudent(@Valid Student student, BindingResult result, ModelMap model) {
		ModelAndView mv = new ModelAndView();
		Integer grade = student.getGrade();
		if (grade == null) {
			model.addAttribute("student", student);
			model.addAttribute("error", "Grade must be Numeric.");
			mv.setViewName("addStudentForm");
		} else {
			studentService.saveStudent(student);
			List<Student> list = studentService.listAllStudents();
			model.addAttribute("allstudents", list);
			model.addAttribute("success", "Student " + student.getName() + " added successfully.");
			mv.setViewName("allStudents");
		}
		return mv;
	}

	/**
	 * This Method will provide the way to update an existing Student
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.GET)
	public String editStudent(@PathVariable Long id, ModelMap model) {
		Student student = studentService.getStudent(id);
		model.addAttribute("student", student);
		model.addAttribute("edit", true);
		return "addStudentForm";
	}

	/**
	 * This method will be called on form submission, handling POST request for
	 * updating Student in database. It also validates the user input
	 * 
	 * @param Student
	 * @param result
	 * @param model
	 * @param ssn
	 * @return
	 */
	@RequestMapping(value = { "/edit-{id}" }, method = RequestMethod.POST)
	public ModelAndView updateStudent(@Valid Student student, BindingResult result, ModelMap model,
			@PathVariable Long id) {
		ModelAndView mv = new ModelAndView();
		Integer grade = student.getGrade();
		if (grade == null) {
			model.addAttribute("student", student);
			model.addAttribute("edit", true);
			model.addAttribute("error", "Grade must be Numeric.");
			mv.setViewName("addStudentForm");
		} else {
			studentService.update(id, student);
			List<Student> list = studentService.listAllStudents();
			model.addAttribute("allstudents", list);
			model.addAttribute("success", "Student " + student.getName() + " updated successfully.");
			mv.setViewName("allStudents");
		}
		return mv;
	}

	/**
	 * This method will Delete a Student by Id
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = { "/delete-{id}" }, method = RequestMethod.GET)
	public ModelAndView deleteStudent(@PathVariable Long id, ModelMap model) {
		ModelAndView mv = new ModelAndView();
		Student student = studentService.getStudent(id);
		studentService.delete(id);
		List<Student> list = studentService.listAllStudents();
		model.addAttribute("allstudents", list);
		model.addAttribute("success", "Student " + student.getName() + " deleted successfully.");
		mv.setViewName("allStudents");
		return mv;
	}

}
