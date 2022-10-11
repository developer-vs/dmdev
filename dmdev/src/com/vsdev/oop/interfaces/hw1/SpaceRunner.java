package com.vsdev.oop.interfaces.hw1;

public class SpaceRunner {

	public static void main(String[] args) {

		Asteroid a1 = new Asteroid("Vesta", 500);
		Asteroid a2 = new Asteroid("Juno", 500);

		System.out.println("Size of " + a1.getSize());
		System.out.println("Size of " + a2.getSize());
		System.out.println(
				"Size of " + a1.getName() + " and " + a2.getName() + " are equals: " + a2.compareSpaceObjects(a1));

		Asteroid a3 = new Asteroid("Pallas", 600);
		Asteroid a4 = new Asteroid("Hygiea", 1200);
		System.out.println(
				"Size of " + a3.getName() + " and " + a4.getName() + " are equals: " + a3.compareSpaceObjects(a4));
		
		Planet p = new Planet(2, 599, 45, true, true, "Undefined");
		System.out.println(p.toString());
		
		Planet p1 = new Earth(200, 300, 75, true,true, "Earth");
		System.out.println(p1.toString());
		System.out.println("Mass of the planet: " + p1.getMass());
		
		Star s1 = new Sun(900, 3, 347888, true, 7560000, "Sun");
		System.out.println(s1.toString());
	}
}
