package io.firstapp.springbootstarter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.firstapp.springbootstarter.entity.Employee;
import io.firstapp.springbootstarter.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value="/getAllEmployeeList", method=RequestMethod.GET)
	public List<Employee> getAll(){
		return employeeService.getAllEmployees();
	}
	
	@RequestMapping(value="/getAllEmployeeListByFirstName", method=RequestMethod.GET)
	public List<Employee> getAllEmployeeByFirstName(String fname){
		return employeeService.getAllEmployeesByFirstName(fname);
	}
	
	@RequestMapping(value="/getEmployeeById", method=RequestMethod.GET)
	public Employee getEmployeeById(Integer id){
		return employeeService.getAllEmployeeByID(id);
	}

}
