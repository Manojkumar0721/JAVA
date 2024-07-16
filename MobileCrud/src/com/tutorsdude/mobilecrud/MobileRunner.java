package com.tutorsdude.mobilecrud;

import com.tutorsdude.mobilecrud.model.Mobile;
import com.tutorsdude.mobilecrud.service.MobileService;

public class MobileRunner {

	public static void main(String[] args) {

		Mobile mobile1 = new Mobile("Samsung", 40000, "Metalic", true);
		Mobile mobile2 = new Mobile("Oneplus", 25000, "Metalic", true);

		MobileService service = new MobileService();

		service.save(mobile1);
		service.save(mobile2);

		Mobile[] mobiles = service.read();

		for (int i = 0; i < mobiles.length; i++) {
			if (mobiles[i] != null) {
				System.out.println(mobiles[i]);
			}
		}

		service.deleteName("Oneplus");
		Mobile[] mobiles1 = service.read();

		for (int i = 0; i < mobiles1.length; i++) {
			if (mobiles1[i] != null) {
				System.out.println(mobiles1[i]);
			}
		}

	}

}
