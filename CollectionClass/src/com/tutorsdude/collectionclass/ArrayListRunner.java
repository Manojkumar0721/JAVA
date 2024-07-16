package com.tutorsdude.collectionclass;

import java.util.ArrayList;

public class ArrayListRunner {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Nissan");
		list.add("Toyota");
		list.add("Mazda");
		list.add("Acura");
		list.add("Lexus");
		list.add("Suzuki");
		list.add("Honda");
		list.add("Yamaha");
		list.add("BMW");
		list.add("Mercedes Benz");
		list.add("porsche");
		list.add("Ferrari");
		list.add("Ford");
		list.add("Lamborgini");
		list.add("Dodge");
		list.add("Cardilac");
		list.add("Chevorlet");
		list.add("Maserati");
		list.add("Aston Martin");
		list.add("Mclaren");
		
		System.out.println(list);
		
		String value = list.get(7);
		System.out.println(value);
		
		String value1 = list.get(9);
		System.out.println(value1);
		
		String value2 = list.get(3);
		System.out.println(value2);
		
		String value3 = list.get(1);
		System.out.println(value3);
		
		String value4 = list.get(5);
		System.out.println(value4);
		
		list.set(0, "SkyLine");
		list.set(1, "Supra");
		list.set(2, "Miata");
		list.set(3, "Infiniti");
		list.set(4, "LFA");
		
		list.remove(9);
		list.remove(2);
		list.remove(1);
		list.remove(7);
		list.remove(8);
		
		for(String str : list) {
			System.out.println(str);
		}
	
		
		
		
		
		
		
		
		
		
		

		

	}
	
	

}
