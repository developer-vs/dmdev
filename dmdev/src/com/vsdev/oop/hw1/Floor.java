package com.vsdev.oop.hw1;

public class Floor {

	private Flat[] flats;
	private int number;

	public Floor() {
	}

	public Floor(int floorNumber, Flat[] flats) {
		number = floorNumber;
		this.flats = flats;
	}

	public int getFloorNumber() {
		return number;
	}

	public Flat[] getFlats() {
		return flats;
	}

	public void print() {
		System.out.println("  Floor number: " + number + ", contains: " + flats.length + " flat(s).");
	}
}
