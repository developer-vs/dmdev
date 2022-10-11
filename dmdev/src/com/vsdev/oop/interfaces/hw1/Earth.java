package com.vsdev.oop.interfaces.hw1;

public class Earth extends Planet {

	public Earth(double volume, double density, double mass, boolean isOrbitAroundStar, boolean isSphere, String name) {
		super(volume, density, mass, isOrbitAroundStar, isSphere, name);
	}

	public void print() {
		System.out.println("The palnet name: " + getName());
	}

	@Override
    public String toString(){
      return "Planet name: "+getName()+
             "\nrotation around star: " + isOrbitAroundStar() +
             "\nand it has sphere: " + isSphere();
    }
}
