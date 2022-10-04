package com.vsdev.oop.hw1;

public class Flat {

	private int flatNumber;
	private int[] numberOfRooms;

	public Flat(int flatNumber, int numberOfRooms) {
		this.flatNumber = flatNumber;
		this.numberOfRooms = new int[numberOfRooms];
	}

	public int getFlatNumber() {
		return flatNumber;
	}

	public void setFlatNumber(int flatNumber) {
		this.flatNumber = flatNumber;
	}

	public void print() {
		System.out.println("Flat number: " + flatNumber + ", number of rooms: " + numberOfRooms.length);
	}

}
