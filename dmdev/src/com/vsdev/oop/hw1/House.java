package com.vsdev.oop.hw1;

public class House {

	private Floor[] floors;
	private Flat[] flats;
	private Room[] rooms;
	private int number;
	
	public House() {}

	public House(int houseNumber, Floor[] floors) {
		number = houseNumber;
		this.floors = floors;
	}

	public int getHouseNumber() {
		return number;
	}

	public void setHouseNumber(int houseNumber) {
		this.number = houseNumber;
	}

	public Floor[] getFloor() {
		return floors;
	}

	public void setFloor(Floor[] floors) {
		this.floors = floors;
	}

	public Flat[] getFlat() {
		return flats;
	}

	public void setFlat(Flat[] flat) {
		flats = flat;
	}

	public Room[] getRoom() {
		return rooms;
	}

	public void setRoom(Room[] rooms) {
		this.rooms = rooms;
	}

	public void print() {
		System.out.println("House number: " + number);
		System.out.println("Number of floors in a house: " + floors.length);		
		System.out.println("Number of flats in a floor: " + floors[0].calculateFlats());
		System.out.println("Number of rooms in a flat: " + floors[0].getFlat()[0].getRooms().length);
	}
}
