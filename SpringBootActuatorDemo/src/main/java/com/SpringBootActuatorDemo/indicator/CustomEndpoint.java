package com.SpringBootActuatorDemo.indicator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "custom")
public class CustomEndpoint 
{
	@ReadOperation
	public String customEndpoint()
	{
		return "This is Custom endpoint";
	}

}
