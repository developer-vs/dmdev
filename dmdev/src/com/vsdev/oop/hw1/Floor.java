package com.vsdev.oop.hw1;

public class Floor {

	private int floorNumber;
	private int[] numberOfFlats;

	public Floor(int floorNumber, int numberOfFlats) {
		this.floorNumber = floorNumber;
		this.numberOfFlats = new int[numberOfFlats];
	}

	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	public void print() {
		System.out.println("Floor number: " + floorNumber + ", number of flats: " + numberOfFlats.length);
	}
}
