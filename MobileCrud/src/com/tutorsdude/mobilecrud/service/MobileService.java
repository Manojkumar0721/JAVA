package com.tutorsdude.mobilecrud.service;

import com.tutorsdude.mobilecrud.model.Mobile;
import com.tutorsdude.mobilecrud.repo.MobileRepository;

public class MobileService {

	private MobileRepository repo = new MobileRepository();

	public boolean save(Mobile mobile) {
		if (validateMobile(mobile)) {
			if (!repo.isExist(mobile)) {
				repo.save(mobile);
				System.out.println("Mobile does not exist");
				return true;
			}
			System.out.println("Mobile exist");
			return false;
		}
		return false;
	}

	public boolean validateMobile(Mobile mobile) {

		if (mobile != null) {
			if (mobile.getBrand() != null && mobile.getBrand().length() > 2) {
				if (mobile.getPrice() > 10000) {
					System.out.println("Laptop is valid");
					return true;
				}
				System.out.println("price is not valid");
				return false;
			}
			System.out.println("brand is not valid");
			return false;

		}
		System.out.println("Mobile is null");
		return false;
	}

	public Mobile[] read() {
		return repo.read();
	}
	
	public boolean updatePriceByName(String name,int price) {
		if(name!=null) {
			if(price>10000) {
				return repo.updatePriceByName(name,price);
			}
		}
		return false;
	}
	
	public boolean deleteName(String name) {
		if(name!=null) {
			return repo.deleteName(name);
		}
		return false;
	}
	

}
