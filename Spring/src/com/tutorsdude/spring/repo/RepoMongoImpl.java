package com.tutorsdude.spring.repo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Mongo")
public class RepoMongoImpl implements SpringRepo{

	@Override
	public boolean save() {
		System.out.println("Saved in Mongo database");
		return false;
	}

}
