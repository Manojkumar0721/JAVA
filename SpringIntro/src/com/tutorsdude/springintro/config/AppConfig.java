package com.tutorsdude.springintro.config;

import org.springframework.context.annotation.Bean;

import com.tutorsdude.springintro.service.Bike;
import com.tutorsdude.springintro.service.Service;

public class AppConfig {
	
	@Bean
	public Service getService() {
		return new Service();
	}
	
	@Bean
	public Bike getBike() {
		return new Bike();
	}

}
