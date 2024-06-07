package com.tutorsdude.enums;

import com.tutorsdude.enums.constants.Diameter;
import com.tutorsdude.enums.constants.SizeOfPizza;
import com.tutorsdude.enums.constants.Slices;

public class PizzaRunner {

	public static void main(String[] args) {
		
		Pizza pizza1 = new Pizza(SizeOfPizza.PERSONAL,Diameter.TEN,Slices.FOUR);
		
		if(pizza1.size.detailsOfPizza.equals("Personal")) {
			System.out.println("Size Is Personal");
		}
		
		for(SizeOfPizza sizeOfPizza :SizeOfPizza.values()) {
			
			System.out.println(sizeOfPizza);
			
		}
		

	}

}
