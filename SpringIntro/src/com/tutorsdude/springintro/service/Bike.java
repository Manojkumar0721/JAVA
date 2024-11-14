package com.tutorsdude.springintro.service;

import com.tutorsdude.springintro.repo.Repo;

public class Bike {
	
	Repo repo = new Repo();
	
	
	public boolean saveBike() {
		return repo.saveBike();
	}

}
