package com.tutorsdude.collectionclass;

import java.util.LinkedHashSet;

public class LinkedHashSetRunner {

	public static void main(String[] args) {
		
		LinkedHashSet lset = new LinkedHashSet();
		
		lset.add(10);
		lset.add(20);
		lset.add(30);
		lset.add(40);
		lset.add(50);
		lset.add(60);
		lset.add(70);
		lset.add(80);
		lset.add(90);
		lset.add(10);
		lset.add(11);
		lset.add(12);
		lset.add(13);
		lset.add(14);
		lset.add(15);
		lset.add(16);
		lset.add(17);
		lset.add(18);
		lset.add(19);
		lset.add(20);
		
		System.out.println(lset);
		
		lset.remove(10);
		lset.remove(11);
		lset.remove(12);
		lset.remove(13);
		lset.remove(14);
		
		System.out.println(lset);
		
		
	}

}
