package com.example.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Address;
import com.example.repo.AddressRepo;
import com.example.response.AddressResponse;

@Service
public class AddressService {

	@Autowired
	AddressRepo address;
	
	@Autowired
	ModelMapper modelMapper;
	public AddressResponse getAddressFromDB( int id) {
		
		Address add = address.findById(id).get();
		AddressResponse addressResponse = 	modelMapper.map(add, AddressResponse.class);
		return addressResponse;
	}
}
