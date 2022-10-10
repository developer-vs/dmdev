package com.vsdev.oop.encapsulation.hw1;

public class Main {

	public static void main(String[] args) {
		
		Atm atm = new Atm(0, 2, 1);
		
		atm.showCurrentBalance();
		atm.add20(1);
		atm.showCurrentBalance();
		atm.getMoney(200);
		atm.showCurrentBalance();
	}
}
