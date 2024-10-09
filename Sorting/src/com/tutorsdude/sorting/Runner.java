package com.tutorsdude.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {

	public static void main(String[] args) {

		Mobile mobile1 = new Mobile("Samsung S24", 110000, 4.89f, 2);
		Mobile mobile2 = new Mobile("Redmi Note 14 Pro", 25000, 3.5f, 1);
		Mobile mobile3 = new Mobile("Iqoo Z9 Pro", 60000, 4.69f, 2);

		List<Mobile> mobiles = Arrays.asList(mobile1, mobile2, mobile3);

//		Collections.sort(mobiles);

		Comparator<Mobile> priceSortByLowToHigh = new Comparator<Mobile>() {

			@Override
			public int compare(Mobile o1, Mobile o2) {
				return Integer.compare(o1.getPrice(), o2.getPrice());
			}

		};

		Comparator<Mobile> priceSortByHighToLow = new Comparator<Mobile>() {

			@Override
			public int compare(Mobile o1, Mobile o2) {
				return Integer.compare(o2.getPrice(), o1.getPrice());
			}

		};

//		mobiles.sort(priceSortByLowToHigh);
//		mobiles.sort(priceSortByHighToLow);

		Comparator<Mobile> ratingHighToLow = new Comparator<Mobile>() {

			@Override
			public int compare(Mobile o1, Mobile o2) {
				return Float.compare(o2.getRating(), o1.getRating());
			}

		};

		Comparator<Mobile> ratingLowToHigh = new Comparator<Mobile>() {

			@Override
			public int compare(Mobile o1, Mobile o2) {
				return Float.compare(o1.getRating(), o2.getRating());
			}

		};

//		mobiles.sort(ratingHighToLow);
//		mobiles.sort(ratingLowToHigh);

		Comparator<Mobile> warrantyHighToLow = new Comparator<Mobile>() {

			@Override
			public int compare(Mobile o1, Mobile o2) {
				return Integer.compare(o2.getWarranty(), o1.getWarranty());
			}

		};

		Comparator<Mobile> warrantyLowToHigh = new Comparator<Mobile>() {

			@Override
			public int compare(Mobile o1, Mobile o2) {
				return Integer.compare(o1.getWarranty(), o2.getWarranty());
			}

		};

//		mobiles.sort(warrantyHighToLow);
//		mobiles.sort(warrantyLowToHigh);

		for (Mobile mobile : mobiles) {
			System.out.println(mobile);
		}

	}

}
