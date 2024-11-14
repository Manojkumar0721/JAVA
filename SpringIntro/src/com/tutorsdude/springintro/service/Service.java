package com.tutorsdude.springintro.service;

import com.tutorsdude.springintro.repo.Repo;

public class Service {
	
	Repo repo = new Repo();
	
	public boolean save() {
		return repo.save();
	}

}
