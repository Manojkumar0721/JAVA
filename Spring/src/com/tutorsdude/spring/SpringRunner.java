package com.tutorsdude.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tutorsdude.spring.config.AppConfig;
import com.tutorsdude.spring.service.Service;

public class SpringRunner {

	public static void main(String[] args) {
		
	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	
	Service service = context.getBean(Service.class);
     
	service.save();

	}

}
