package com.tutorsdude.enums.constants;

public enum Diameter {
	TEN(10),TWELVE(12),FOURTEEN(14),SIXTEEN(16);
	
	public int diameterOfPizza;
	
	Diameter(int diameterOfPizza){
		this.diameterOfPizza = diameterOfPizza;
	}

}
