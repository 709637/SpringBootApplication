package io.firstapp.springbootstarter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.firstapp.springbootstarter.entity.Employee;
import io.firstapp.springbootstarter.repository.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	public List<Employee> getAllEmployees(){
		return employeeRepo.findAll();
	}
	
	public Employee getAllEmployeeByID(Integer id){
		return employeeRepo.findAllByEmployeeId(id);
	}
	
	public List<Employee> getAllEmployeesByFirstName(String fname){
		return employeeRepo.findAllByFirstName(fname);
	}
	

}
