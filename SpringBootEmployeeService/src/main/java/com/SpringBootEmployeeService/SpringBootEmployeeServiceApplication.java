package com.SpringBootEmployeeService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringBootEmployeeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmployeeServiceApplication.class, args);
	}

}
