package com.springRest.Assignment5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employeecontroller {

	@Autowired
	Employeeservice employeeservice;

	/**
	 * Annotation for mapping web requests onto methods in request-handling classes
	 * with flexible method signatures.
	 */
	@RequestMapping("/employee")
	public List<Employee> getEmployees() {
		return employeeservice.getAllEmployees();

	}

	@RequestMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable String id) {
		long empId = Long.parseLong(id);
		return employeeservice.getEmployee(empId);
	}

	/**
	 * @method = RequestMethod.POST It is useful for defining specific API requests
	 *         apart from default GET
	 */
	@RequestMapping(value = "/employee/{id}", method = RequestMethod.DELETE)
	public Employee deleteEmployeeById(@PathVariable String id) {
		long empId = Long.parseLong(id);
		return employeeservice.deleteEmployee(empId);
	}

	/**
	 * adds a new employee object
	 * 
	 * @param employee is passed and requested from postman
	 * @requestBody gets the JSON response
	 */
	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public void addEmployee(@RequestBody Employee employee) {
		employeeservice.addEmployee(employee);
	}

	// Update employee using PUT
	@RequestMapping(value = "/employee", method = RequestMethod.PUT)
	public void updateEmployee(@RequestBody Employee employee) {
		employeeservice.updateEmployee(employee);
	}

}
