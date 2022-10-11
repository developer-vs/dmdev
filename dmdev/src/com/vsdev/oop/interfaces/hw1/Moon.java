package com.vsdev.oop.interfaces.hw1;

public class Moon {
	
	private boolean isOrbitAroundPlanet;
	private boolean isSphere;
	private String name;
	
	public Moon(boolean isOrbitAroundPlanet, boolean isSphere, String name) {
		super();
		this.isOrbitAroundPlanet = isOrbitAroundPlanet;
		this.isSphere = isSphere;
		this.name = name;
	}
	public boolean isOrbitAroundPlanet() {
		return isOrbitAroundPlanet;
	}
	public boolean isSphere() {
		return isSphere;
	}
	public String getName() {
		return name;
	}
	
	public void print() {
		System.out.println("The moon name: " + getName());
	}

	@Override
    public String toString(){
      return "Moon name: "+getName()+
             "\ntrotation around planet: " + isOrbitAroundPlanet;
    }
}
