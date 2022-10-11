package com.vsdev.oop.interfaces.hw1;

public class Asteroid {
	
	private String name;
	private double size;
	private final double P = 3.14;
	
	public Asteroid(String name, double size) {
		super();
		this.name = name;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public double getSize() {
		return size;
	}
	
	public void getDiametr() {
		double d = size / 2 * P;
		System.out.println(d);
	}
	
	public boolean compareSpaceObjects(Asteroid asteroid) {
		return this.getSize() == asteroid.getSize();
	}

	public void print() {
		System.out.println("The asteroid name: " + getName());
	}

	@Override
    public String toString(){
      return "Asteroid name: "+getName()+
             "\ntsize: " + getSize();
    }

}
