package com.vsdev.oop.hw1;

public class Main {

	public static void main(String[] args) {

		Room[] rooms = new Room[3];
		for (int i = 0; i < rooms.length; i++) {
			if (i % 2 == 0) {
				rooms[i] = new Room(true);
			} else {
				rooms[i] = new Room(false);
			}
		}

		Flat[] flats = new Flat[4];
		for (int i = 0; i < flats.length; i++) {
			flats[i] = new Flat(i, rooms);
		}

		Floor[] floors = new Floor[5];
		for (int i = 0; i < floors.length; i++) {
			floors[i] = new Floor(i, flats);
		}

		House[] house = new House[2];
		for(int i = 0; i < house.length; i++) {
			house[i] = new House(i, floors);
		}
		
		printAllInformation(house);
	}

	public static void printAllInformation(House[] house) {
		for(int i = 0; i < house.length; i++) {
			house[i].print();
		}
	}
}
