package com.tutorsdude.sorting;

import java.util.Comparator;

public class PriceHighToLowComparator implements Comparator<Mobile>{

	@Override
	public int compare(Mobile o1, Mobile o2) {
		
		return Integer.compare(o2.getPrice(),o1.getPrice());
	}

}
