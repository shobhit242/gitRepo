package com.example.demo.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.feign.AddressClient;
import com.example.demo.repo.EmployeeRepo;
import com.example.demo.response.AddressResponse;
import com.example.demo.response.EmployeeResponse;

@Service
public class EmployeeService {
@Autowired
	EmployeeRepo repo;
@Autowired
ModelMapper mapper;
@Autowired
AddressClient client;
	public EmployeeResponse getEmployeeDetails(int id) {
		
		Employee emp = repo.findById(id).get();
		EmployeeResponse employeeResponse  = mapper.map(emp, EmployeeResponse.class);
		AddressResponse addres = client.getAddress(id);
		employeeResponse.setAddressResponse(addres);
		return employeeResponse;
	}
}
