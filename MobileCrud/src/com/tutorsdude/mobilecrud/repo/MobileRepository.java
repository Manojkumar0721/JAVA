package com.tutorsdude.mobilecrud.repo;

import com.tutorsdude.mobilecrud.model.Mobile;

public class MobileRepository {
	
	
	private Mobile[] mobiles = new Mobile[10];
	
	public boolean save(Mobile mobile) {
		
		for(int i=0; i<mobiles.length;i++) {
			if(mobiles[i] == null) {
				mobiles[i] = mobile;
				System.out.println("Mobile Saved");
				return true;
			}
		}
		System.out.println("No space found");
		return false;
	}
	
	public boolean isExist(Mobile mobile) {
		for(int i=0;i<mobiles.length;i++) {
			if(mobile.equals(mobiles[i])) {
				return true;
			}
		}
		return false;
	}
	
	public Mobile[] read() {
		return mobiles;
	}
	
	public boolean updatePriceByName(String name,int price) {
		for(int i=0;i<mobiles.length;i++) {
			if(name.equals(mobiles[i].getBrand())) {
			mobiles[i].setPrice(price);
			System.out.println("Price Updated");
			return true;
			}
		}
		System.out.println("Name not found");
		return false;
	}
	
	public boolean deleteName(String name) {
		for (int i = 0; i < mobiles.length; i++) {
			if (name.equals(mobiles[i].getBrand())) {
				mobiles[i] = null;
				System.out.println("Name Deleted");
				return true;
			}
		}
		System.out.println("Name Not Found");
		return false;
	}
	

}
