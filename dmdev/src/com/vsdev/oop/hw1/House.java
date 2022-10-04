package com.vsdev.oop.hw1;

public class House {

	private int houseNumber;
	private int[] numberOfFloors;
	private Floor floor;
	private Flat flat;
	private Room room;

	public House(int houseNumber, int numberOfFloors, Floor floor, Flat flat, Room room) {
		this.houseNumber = houseNumber;
		this.numberOfFloors = new int[numberOfFloors];
		this.floor = floor;
		this.flat = flat;
		this.room = room;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public void print() {
		System.out.println("House number: " + houseNumber + ", number of floors: " + numberOfFloors.length);
	}

	public void printAllInformation(House house) {
		house.print();
		floor.print();
		flat.print();
		room.print();
	}
}
