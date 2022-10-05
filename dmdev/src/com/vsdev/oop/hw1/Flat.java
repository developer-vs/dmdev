package com.vsdev.oop.hw1;

public class Flat {

	private Room[] rooms;
	private int number;
	
	public Flat() {}

	public Flat(int flatNumber, Room[] rooms) {
		number = flatNumber;
		this.rooms = rooms;
	}

	public int getFlatNumber() {
		return number;
	}

	public void setFlatNumber(int flatNumber) {
		this.number = flatNumber;
	}

	public Room[] getRooms() {
		return rooms;
	}

	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}

	public void print() {
		System.out.println("Flat number: " + number);
		for(int i = 0; i < rooms.length; i ++) {
			rooms[i].print();
		}
	}
}
