package com.tutorsdude.collectionclass;

import java.util.HashMap;
import java.util.Map;

public class RoomsRunner {

	public static void main(String[] args) {

		Map<Integer, Rooms> map = new HashMap<Integer, Rooms>();

		Rooms room0 = new Rooms(100, "AC", 2000, "Avilable");
		Rooms room1 = new Rooms(101, "NON-AC", 800, "Under Maintenance");
		Rooms room2 = new Rooms(102, "AC", 3000, "Avilable");
		Rooms room3 = new Rooms(103, "NON-AC", 1000, "Not Avilable");
		Rooms room4 = new Rooms(104, "AC", 1000, "Not Avilable");
		Rooms room5 = new Rooms(105, "AC", 2000, "Avilable");

		map.put(100, room0);
		map.put(101, room1);
		map.put(102, room2);
		map.put(103, room3);
		map.put(104, room4);
		map.put(105, room5);

		for (Integer key : map.keySet()) {
			Rooms room = map.get(key);
			if (room.getRoomType().equals("NON-AC")) {
				System.out.println(room);
			}
		}

	}

}
