package com.vsdev.oop.interfaces.hw1;

public final class SpaceUtils {
	
	private SpaceUtils() {}	
	
	public static double getGravityPower(CelestialBody mass1, CelestialBody mass2, double distance) {
		double planetMass1 = mass1.getMass();
		double planetMass2 = mass2.getMass();
		double gravity = 0;
		double percent = 3.7;
		if(planetMass1 > planetMass2) {
			gravity = (planetMass1 - planetMass2) / distance * percent;
		} else {
			gravity = (planetMass2 - planetMass1) / distance * percent;
		}
		return gravity;
	}
	
	public static boolean isStar(CelestialBody mass, Star star) {
		double planetMass = mass.getMass();
		boolean isBright = star.isBright();
		if(planetMass > 25 && isBright) {
			return true;
		}
		return false;
	}
}
