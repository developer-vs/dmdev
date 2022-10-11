package com.vsdev.oop.interfaces.hw1;

public class Sun extends Star {

	public Sun(double volume, double density, double mass, boolean isBright, double size, String name) {
		super(volume, density, mass, isBright, size, name);
	}

	public void print() {
		System.out.println("The star name: " + getName());
	}

	@Override
	public String toString() {
		return "Star name: " + getName() + "\nthe star is bright: " + isBright() + "\nthe size of the star: "
				+ getSize();
	}
}
