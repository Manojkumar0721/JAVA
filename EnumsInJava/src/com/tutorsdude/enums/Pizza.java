package com.tutorsdude.enums;

import com.tutorsdude.enums.constants.Diameter;
import com.tutorsdude.enums.constants.SizeOfPizza;
import com.tutorsdude.enums.constants.Slices;

public class Pizza {
	
	SizeOfPizza size;
	Diameter diameterOfPizza;
	Slices slices;
	
	public Pizza(SizeOfPizza size,Diameter diameterOfPizza,Slices slices) {
		this.size = size;
		this.diameterOfPizza = diameterOfPizza;
		this.slices = slices;
	}
	
	
	

}
