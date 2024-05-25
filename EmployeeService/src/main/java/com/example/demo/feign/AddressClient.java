package com.example.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.response.AddressResponse;



@FeignClient(name = "abc", url = "localhost:8080/")
public interface AddressClient {


	@GetMapping("/address/{id}")
	 AddressResponse getAddress(@PathVariable("id") int id);
}
