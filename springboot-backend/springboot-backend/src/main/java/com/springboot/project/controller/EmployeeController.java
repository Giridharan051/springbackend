package com.springboot.project.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.project.model.Employee;
import com.springboot.project.service.imp.EmployeeService;


@RestController
@RequestMapping("/api/employeee")
public class EmployeeController {
	
	//DI
    private EmployeeService employeeService;
   
   //Constructor
    public EmployeeController(EmployeeService employeeService) {
        super();
        this.employeeService = employeeService;
    }
    
    //Build create employee REST API
    @PostMapping
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        return new ResponseEntity<Employee>(employeeService.saveEmployee(employee),
                HttpStatus.CREATED);

}
}