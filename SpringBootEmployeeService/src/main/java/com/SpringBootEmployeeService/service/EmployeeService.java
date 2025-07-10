package com.SpringBootEmployeeService.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.SpringBootEmployeeService.entity.Employee;
import com.SpringBootEmployeeService.feignclient.AddressClient;
import com.SpringBootEmployeeService.reponse.AddressResponse;
import com.SpringBootEmployeeService.reponse.EmployeeResponse;
import com.SpringBootEmployeeService.repository.EmployeeRepository;

@Service
public class EmployeeService 
{
	
	@Autowired
	public EmployeeRepository repository;
	
	@Autowired
	public ModelMapper mapper;
	
	// Spring will create the implementation
    // for this class
    // and will inject the bean here (proxy)
	@Autowired
	public AddressClient client;
	
	public EmployeeResponse getEmployeeById(int empId)
	{
		
		Optional<Employee> employee=repository.findById(empId);
		EmployeeResponse response =mapper.map(employee, EmployeeResponse.class);
		
		//Use FeignClient
		ResponseEntity<AddressResponse> addressResponse=client.getAddressByEmployeeId(empId);
		response.setAddressResponse(addressResponse.getBody());
		return response;
	}
	
	
	
	
}
