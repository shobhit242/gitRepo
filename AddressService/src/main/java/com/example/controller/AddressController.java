package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Address;
import com.example.response.AddressResponse;
import com.example.service.AddressService;


@RestController
public class AddressController {

	@Autowired
	AddressService addressService;
	
	
	@GetMapping("/address/{id}")
   AddressResponse getAddress(@PathVariable("id") int id) {
		
		AddressResponse a =  addressService.getAddressFromDB(id);
		return a;
	}
	
	
}
