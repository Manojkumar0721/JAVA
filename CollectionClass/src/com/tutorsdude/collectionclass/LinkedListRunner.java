package com.tutorsdude.collectionclass;

import java.util.LinkedList;

public class LinkedListRunner {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("Manoj");
		linkedList.add("Akhilesh");
		linkedList.add("Rakshitha");
		linkedList.add("Saikumar");
		linkedList.add("Varshi");
		linkedList.add("Sarvam");
		linkedList.add("Prasanna");
		linkedList.add("Lakshmi");
		linkedList.add("Naruto");
		linkedList.add("Hinata");
		linkedList.add("Sasuke");
		linkedList.add("Sakura");
		linkedList.add("Shikamaru");
		linkedList.add("Timari");
		linkedList.add("Gara");
		linkedList.add("Jiraya");
		linkedList.add("Tenten");
		linkedList.add("Nezuko");
		linkedList.add("Itadori");
		
		System.out.println(linkedList);
		
		String value = linkedList.get(7);
		System.out.println(value);
		
		String value1 = linkedList.get(9);
		System.out.println(value1);
		
		String value2 = linkedList.get(3);
		System.out.println(value2);
		
		String value3 = linkedList.get(1);
		System.out.println(value3);
		
		String value4 = linkedList.get(5);
		System.out.println(value4);
		
		linkedList.set(5, "Rukmini");
		linkedList.set(14, "Tanjiro");
		linkedList.set(15, "Minato");
		linkedList.set(16, "Tamayo");
		linkedList.set(17, "Sukuna");
		
		for(String str : linkedList) {
			System.out.println(str);
		}

	}

}
