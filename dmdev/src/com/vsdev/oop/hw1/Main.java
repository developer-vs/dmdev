package com.vsdev.oop.hw1;

public class Main {

	public static void main(String[] args) {

		Flat flat1 = new Flat(1, new Room[] { new Room(true), new Room(false) });
		Flat flat2 = new Flat(2, new Room[] { new Room(true), new Room(false) });
		Flat flat3 = new Flat(3, new Room[] { new Room(true), new Room(true), new Room(false) });
		Flat flat4 = new Flat(4, new Room[] { new Room(true), new Room(true), new Room(false) });

		Floor floor1 = new Floor(1, new Flat[] { flat1, flat2, flat3, flat4 });
		Floor floor2 = new Floor(2, new Flat[] { flat1, flat2, flat3, flat4 });
		Floor floor3 = new Floor(3, new Flat[] { flat1, flat2, flat3, flat4 });

		House house1 = new House(1, new Floor[] { floor1, floor2, floor3 });
		House house2 = new House(2, new Floor[] { floor1, floor2 });

		printAllInformation(house1);
	}

	public static void printAllInformation(House house) {
		house.print();
		for (Floor floor : house.getFloors()) {
			floor.print();
			for (Flat flat : floor.getFlats()) {
				flat.print();
				for (Room room : flat.getRooms()) {
					room.print();
				}
			}
		}
	}
}
