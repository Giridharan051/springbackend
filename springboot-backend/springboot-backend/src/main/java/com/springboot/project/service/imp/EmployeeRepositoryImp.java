package com.springboot.project.service.imp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.project.model.Employee;
import com.springboot.project.repository.EmployeeRepository;


@Service
public class EmployeeRepositoryImp implements EmployeeService{
	@Autowired
	private EmployeeRepository employeeRepository;

	  public EmployeeRepositoryImp(EmployeeRepository employeeRepository) {
	        super();
	        this.employeeRepository = employeeRepository;
	    }
	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
		
		
	}

}