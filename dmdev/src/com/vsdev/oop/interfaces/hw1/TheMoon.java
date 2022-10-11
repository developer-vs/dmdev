package com.vsdev.oop.interfaces.hw1;

public class TheMoon extends Moon {

	public TheMoon(boolean isOrbitAroundPlanet, boolean isSphere, String name) {
		super(isOrbitAroundPlanet, isSphere, name);
	}
	
	public void print() {
		System.out.println("The moon name: " + getName());
	}

	@Override
    public String toString(){
      return "Moon name: "+getName()+
             "\nrotation around planet: " + isOrbitAroundPlanet() +
             "\nand it has sphere: " + isSphere();
    }

}
