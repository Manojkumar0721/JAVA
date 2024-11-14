package com.tutorsdude.springintro;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tutorsdude.springintro.config.AppConfig;
import com.tutorsdude.springintro.service.Bike;
import com.tutorsdude.springintro.service.Service;

public class Runner {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
	   Bike bike = context.getBean(Bike.class);
	   
	   bike.saveBike();

	}

}
