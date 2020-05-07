package io.firstapp.springbootstarter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.firstapp.springbootstarter.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer>{
	
	Employee findAllByEmployeeId(Integer id);
	List<Employee> findAll();
	List<Employee> findAllByFirstName(String FirstName);

}
