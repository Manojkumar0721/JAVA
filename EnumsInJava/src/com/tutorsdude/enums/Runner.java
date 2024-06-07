package com.tutorsdude.enums;

import com.tutorsdude.enums.constants.Material;
import com.tutorsdude.enums.constants.Pocket;
import com.tutorsdude.enums.constants.Size;
import com.tutorsdude.enums.constants.Sleeves;

public class Runner {

	public static void main(String[] args) {
		
		Shirt shirt = new Shirt(Material.COTTEN,Sleeves.FULL,Pocket.SINGLE,2000,Size.LARGE);
		
		if(shirt.material.value.equals("Cotten")) {
			System.out.println("Material Is Cotten");
			
		}
		else {
			System.out.println("Material is Not a Cotten");
		}
		
		Shirt shirt01 = new Shirt(Material.LINEN,Sleeves.HALF,Pocket.DOUBLE,3000,Size.MEDIUM);
		
		if(shirt01.pocket.value >= 2 ){
			System.out.println("Shirt have 2 Pockets");
		}
		else {
			System.out.println("Shirt have 1 Pockets");
		}
		
		
		
		

	}

}
