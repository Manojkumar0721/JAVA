package com.tutorsdude.collectionclass;

import java.util.HashSet;

public class HashSetRunner {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(60);
		set.add(70);
		set.add(80);
		set.add(90);
		set.add(10);
		set.add(11);
		set.add(12);
		set.add(13);
		set.add(14);
		set.add(15);
		set.add(16);
		set.add(17);
		set.add(18);
		set.add(19);
		set.add(20);
		
		System.out.println(set);
		
		int size = set.size();
		System.out.println(size);
		
		
		set.remove(10);
		set.remove(11);
		set.remove(12);
		set.remove(13);
		set.remove(14);
		
		System.out.println(set);
		
		int size1 = set.size();
		System.out.println(size1);
		
		
		
		
	
	}

}
