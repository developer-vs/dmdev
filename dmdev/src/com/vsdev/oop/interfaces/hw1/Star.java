package com.vsdev.oop.interfaces.hw1;

public class Star extends CelestialBody {

	private boolean isBright;
	private double size;
	private String name;
	
	public Star(double volume, double density, double mass, boolean isBright, double size, String name) {
		super(volume, density, mass);
		this.isBright = isBright;
		this.size = size;
		this.name = name;
	}

	public boolean isBright() {
		return isBright;
	}

	public double getSize() {
		return size;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "This is a star: " + getName();
	}
}
