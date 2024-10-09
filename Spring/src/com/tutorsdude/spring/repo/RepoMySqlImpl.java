package com.tutorsdude.spring.repo;

import org.springframework.stereotype.Component;

@Component("MySql")
public class RepoMySqlImpl implements SpringRepo{

	@Override
	public boolean save() {
		System.out.println("Saved in MySql database");
		return false;
	}

}
