/**
 * 
 */
package com.SpringBootActuatorDemo.indicator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * 
 */
@Component
public class CustomHealthIndicator implements HealthIndicator
{

	@Override
	public Health health()
	{
		// TODO Auto-generated method stub
		boolean isHealthy=checkCustomHealth();
		if(isHealthy)
		{
			return Health.up().withDetail("CustomHealth", "All systems are operational").build();
		}else
		{
			return Health.down().withDetail("CustomHealth", "Some systems are down").build();
		}
		
	}

	private boolean checkCustomHealth()
	{
		return true;
	}
}
