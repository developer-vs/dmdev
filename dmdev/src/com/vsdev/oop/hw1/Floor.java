package com.vsdev.oop.hw1;

public class Floor {

	private Flat[] flats;
	private int number;

	public Floor() {}

	public Floor(int floorNumber, Flat[] flat) {
		number = floorNumber;
		flats = flat;
	}

	public int getFloorNumber() {
		return number;
	}

	public void setFloorNumber(int floorNumber) {
		this.number = floorNumber;
	}

	public Flat[] getFlat() {
		return flats;
	}

	public void setFlat(Flat[] flat) {
		flats = flat;
	}
	
	public int calculateFlats() {
		return flats.length;
	}

	public void print() {
		System.out.println("Floor number: " + number);
		
	}
}
