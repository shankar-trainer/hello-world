package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cts.dao.EmployeeRepository;
import com.cts.dao.EvaluationRepository;
import com.cts.model.Employee;
import com.cts.model.Evaluation;

public class EmployeeService {

	@Autowired
	EmployeeRepository empRep;

	@Autowired
	EvaluationRepository evalRep;

	public Evaluation addEvaluation(Evaluation evaluation) {
		return evalRep.save(evaluation);
	}

	public Employee addEmployee(Employee employee) {
		return empRep.save(employee);
	}

	public void removeEmployeeEvaluation(int empId, int evalId) {
		/*
		 * Employee emp = em.find(Employee.class, empId); Evaluation eval =
		 * em.find(Evaluation.class, evalId); emp.getEvals().remove(eval);
		 */
		Employee employee = empRep.findById(empId).get();
		Evaluation eval = evalRep.findById(evalId).get();

		employee.getEvals().remove(eval);
	}

	public List<Employee> findAllEmployees() {
		return empRep.findAll();
	}

//    public List<Evaluation> findAllEvaluations() {
//        return em.createQuery("SELECT e FROM Evaluation e", Evaluation.class)
//                 .getResultList();
//    }
}
