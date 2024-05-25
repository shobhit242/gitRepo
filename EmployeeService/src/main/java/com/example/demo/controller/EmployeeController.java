package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.response.EmployeeResponse;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	
	@Autowired
	EmployeeService service;
	
	
	@GetMapping("/employee/{id}")
	EmployeeResponse  getEmpDetails(@PathVariable("id") int id) {
		
		EmployeeResponse  e = service.getEmployeeDetails(id);
		return e;
	}
}
