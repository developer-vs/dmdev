package com.vsdev.oop.hw1;

public class Main {

	public static void main(String[] args) {

		Room room = new Room(true);
		Flat flat = new Flat(2, 3);
		Floor floor = new Floor(1, 4);
		House house = new House(77, 9, floor, flat, room);
		house.printAllInformation(house);
	}
}
