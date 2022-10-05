package com.vsdev.oop.hw1;

public class Room {

	private boolean isWalkThrough;

	public Room() {
	}

	public Room(boolean isWalkThrough) {
		this.isWalkThrough = isWalkThrough;
	}

	public boolean getRoomState() {
		return isWalkThrough;
	}

	public void print() {
		if (isWalkThrough) {
			System.out.println("      One room is a walk-through.");
		} else {
			System.out.println("      One room is not a walk-through.");
		}
	}
}
