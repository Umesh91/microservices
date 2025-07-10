package com.SpringBootEmployeeService.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.SpringBootEmployeeService.reponse.AddressResponse;

@FeignClient(name = "address-service",url = "http://localhost:9001/address-service")
public interface AddressClient 
{
	@GetMapping("/address/{id}")
	public ResponseEntity<AddressResponse>getAddressByEmployeeId(@PathVariable("id") int id);

}
