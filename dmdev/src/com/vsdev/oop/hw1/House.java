package com.vsdev.oop.hw1;

public class House {

	private Floor[] floors;
	private int number;

	public House() {
	}

	public House(int houseNumber, Floor[] floors) {
		number = houseNumber;
		this.floors = floors;
	}

	public int getHouseNumber() {
		return number;
	}

	public Floor[] getFloors() {
		return floors;
	}

	public void print() {
		System.out.println("House number: " + number + ", contains: " + floors.length + " floor(s).");
	}
}
