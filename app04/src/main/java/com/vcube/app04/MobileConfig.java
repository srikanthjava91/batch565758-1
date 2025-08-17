package com.vcube.app04;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Indicates that a class declares one or more 
//@Bean methods and may be processed by the Spring container 
//to generate bean definitions and service requests for those beans at runtime.
@Configuration
public class MobileConfig {

	@Bean(name = "mob")
	Mobile getMobile() {
//		return new Mobile();

		Mobile m = new Mobile();
//		m.setBrand("Samsung");
//		m.setModel("S5");
//		m.setPrice(500000.0);

		return m;

	}

}
