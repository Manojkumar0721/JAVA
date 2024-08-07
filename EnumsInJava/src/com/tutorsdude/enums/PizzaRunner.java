package com.tutorsdude.enums;

import com.tutorsdude.enums.constants.Diameter;
import com.tutorsdude.enums.constants.SizeOfPizza;
import com.tutorsdude.enums.constants.Slices;

public class PizzaRunner {

	public static void main(String[] args) {
		
		Pizza pizza1 = new Pizza(SizeOfPizza.PERSONAL,Diameter.TEN,Slices.FOUR);
		Pizza pizza2 = new Pizza(SizeOfPizza.EXTRALARGE,Diameter.SIXTEEN,Slices.EIGHT);
		
		if(pizza1.size.detailsOfPizza.equals("Personal")) {
			System.out.println("Size Is Personal");
		}
		
		for(SizeOfPizza sizeOfPizza :SizeOfPizza.values()) {
			
			System.out.println(sizeOfPizza);
			
		}
		
		if(pizza2.size.detailsOfPizza.equals("ExtraLarge")) {
			System.out.println("Size is ExtraLarge");
		}
		
		Slices slices = Slices.TEN;
		
		switch(slices) {
		case FOUR:
			System.out.println("Four slices");
			break;
		case SIX:
			System.out.println("Six slices");
			break;
		case EIGHT:
			System.out.println("Eight slices");
			break;
		case TEN:
			System.out.println("Ten slices");
			break;
		}
		

	}

}
