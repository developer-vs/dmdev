package com.vsdev.oop.hw1;

public class Room {

	private boolean isThroughPass;

	public Room(boolean isThroughPass) {
		this.isThroughPass = isThroughPass;
	}

	public boolean getRoomState() {
		return isThroughPass;
	}

	public void setRoomState(boolean isThroughPass) {
		this.isThroughPass = isThroughPass;
	}

	public void print() {
		System.out.println("Is room through pass: " + isThroughPass);
	}

}
