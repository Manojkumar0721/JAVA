package com.tutorsdude.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.tutorsdude.spring.repo.SpringRepo;


@Component
public class Service {
	
	@Autowired
	@Qualifier("Mongo")
	private SpringRepo repo;
	
	
	public boolean save() {
		repo.save();
		return true;
	}
	

}
