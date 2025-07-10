/**
 * 
 */
package com.SpringBootEmployeeService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootEmployeeService.reponse.EmployeeResponse;
import com.SpringBootEmployeeService.service.EmployeeService;

/**
 * 
 */
@RestController
public class EmployeeController 
{
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/employees/{id}")
	public ResponseEntity<EmployeeResponse>getEmployeeDetails(@PathVariable("id") int id)
	{
		EmployeeResponse response=service.getEmployeeById(id);
		//return response as body containing the requested details by user
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
}
