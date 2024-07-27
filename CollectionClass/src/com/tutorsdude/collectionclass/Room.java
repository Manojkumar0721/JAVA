package com.tutorsdude.collectionclass;

public class Room {

	private int roomNumber;
	private String roomType;
	private int price;
	private String status;

	public Room(int roomNumber, String roomType, int price, String status) {
		super();
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.price = price;
		this.status = status;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public String getRoomType() {
		return roomType;
	}

	public int getPrice() {
		return price;
	}

	public String getStatus() {
		return status;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Room [roomNumber=" + roomNumber + ", roomType=" + roomType + ", price=" + price + ", status=" + status
				+ "]";
	}

}
