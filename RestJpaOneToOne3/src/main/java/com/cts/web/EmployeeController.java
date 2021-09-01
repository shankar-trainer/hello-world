package com.cts.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.dao.EmployeeRepository;
import com.cts.dao.EvaluationRepository;
import com.cts.model.Employee;
import com.cts.model.Evaluation;

@RestController
@RequestMapping("/student")
public class EmployeeController {

	@Autowired
	EmployeeRepository empRep;

	@Autowired
	EvaluationRepository evalRep;

	@PostMapping("/addEval")
	public Evaluation addEvaluation(@RequestBody Evaluation evaluation) {
		return evalRep.save(evaluation);
	}

	@PostMapping("/addEmp")
	public Employee addEmployee(@RequestBody Employee employee) {
		return empRep.save(employee);
	}

	@DeleteMapping("/removeEmp/{empId}/{evalId}")
	public void removeEmployeeEvaluation(@PathVariable("empId") int empId, @PathVariable("evalId") int evalId) {
		/*
		 * Employee emp = em.find(Employee.class, empId); Evaluation eval =
		 * em.find(Evaluation.class, evalId); emp.getEvals().remove(eval);
		 */

		Employee employee = empRep.findById(empId).get();
		Evaluation eval = evalRep.findById(evalId).get();

		employee.getEvals().remove(eval);
		
		System.out.println("record deleted "+eval);
		
	}

	@GetMapping("/all")
	public List<Employee> findAllEmployees() {
		return empRep.findAll();
	}

}
