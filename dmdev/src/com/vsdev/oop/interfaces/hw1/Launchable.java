package com.vsdev.oop.interfaces.hw1;

public interface Launchable {

	int TIME_AROUND_EARTH = 24;

	void print();

	default void printOrbit() {
		System.out.println(getrbit());
	}

	private String getrbit() {
		return "Time around medium Earth orbit: " + TIME_AROUND_EARTH;
	}
}
