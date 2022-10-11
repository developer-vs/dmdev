package com.vsdev.oop.interfaces.hw1;

public class Satellite implements Launchable {
	
	private boolean isEngine;
	private String model;
	private int year;
	
	public Satellite(boolean isEngine, String model, int year) {
		super();
		this.isEngine = isEngine;
		this.model = model;
		this.year = year;
	}

	public boolean getEngine() {
		return isEngine;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}
	
	public void print() {
		System.out.println("The satellite model: " + getModel());
	}

	@Override
    public String toString(){
      return "Model: "+getModel()+
             "\nyear: " + getYear() +
             "\nhas engine: " + getEngine();
    }
}
