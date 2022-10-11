package com.vsdev.oop.interfaces.hw1;

public class CelestialBody {
	
	private double volume;
	private double density;
	private double mass;
	
	public CelestialBody(double volume, double density, double mass) {
		super();
		this.volume = volume;
		this.density = density;
		this.mass = mass;
	}
	
	public double getMass() {
		mass = volume * density;
		return mass;
	}
	
	@Override
    public String toString(){
      return "Volume: " + volume +
             "\ndensity: " + density +
             "\nmass: " + getMass();
    }
}
