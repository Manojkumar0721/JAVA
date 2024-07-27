package com.tutorsdude.collectionclass;

import java.util.HashMap;
import java.util.Map;

public class RoomsRunner {

	public static void main(String[] args) {

		Map<Integer, Room> map = new HashMap<Integer, Room>();

		Room room0 = new Room(100, "AC", 2000, "Avilable");
		Room room1 = new Room(101, "NON-AC", 800, "Under Maintenance");
		Room room2 = new Room(102, "AC", 3000, "Avilable");
		Room room3 = new Room(103, "NON-AC", 1000, "Not Avilable");
		Room room4 = new Room(104, "AC", 1000, "Not Avilable");
		Room room5 = new Room(105, "AC", 2000, "Avilable");

		map.put(100, room0);
		map.put(101, room1);
		map.put(102, room2);
		map.put(103, room3);
		map.put(104, room4);
		map.put(105, room5);

		for (Integer key : map.keySet()) {
			Room room = map.get(key);
			if (room.getRoomType().equals("NON-AC")) {
				System.out.println(room);
			}
		}

	}

}
