package com.vsdev.oop.interfaces.hw1;

public class Planet extends CelestialBody {

	private boolean isOrbitAroundStar;
	private boolean isSphere;
	private String name;

	public Planet(double volume, double density, double mass, boolean isOrbitAroundStar, boolean isSphere,
			String name) {
		super(volume, density, mass);
		this.isOrbitAroundStar = isOrbitAroundStar;
		this.isSphere = isSphere;
		this.name = name;
	}

	public boolean isOrbitAroundStar() {
		return isOrbitAroundStar;
	}

	public boolean isSphere() {
		return isSphere;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "This is a planet: " + getName();
	}
}
