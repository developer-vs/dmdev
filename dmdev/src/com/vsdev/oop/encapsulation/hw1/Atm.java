package com.vsdev.oop.encapsulation.hw1;

public class Atm {

	private static int amount20;
	private static int amount50;
	private static int amount100;

	public Atm(int amount20, int amount50, int amount100) {
		this.amount20 += amount20;
		this.amount50 += amount50;
		this.amount100 += amount100;
	}

	public void add20(int value) {
		System.out.println(value * 20 + "$ will be added to your account.");
		amount20 += value;
	}

	public void add50(int value) {
		System.out.println(value * 50 + "$ will be added to your account.");
		amount50 += value;
	}

	public void add100(int value) {
		System.out.println(value * 100 + "$ will be added to your account.");
		amount100 += value;
	}

	public boolean getMoney(int value) {

		StringBuilder sb = new StringBuilder();
		int counter20 = 0;
		int counter50 = 0;
		int counter100 = 0;

		String wrongAmount = "No banknotes for this amount available." + "\nWe have: " + "\n\t20$ x " + amount20
				+ "\n\t50$ x " + amount50 + "\n       100$ x " + amount100;

		showLoadingMessage(value);

		if (value > calculateTotalBalance()) {
			System.out.println("\nError: insufficient balance in your account.");
			return false;
		} else if (value == 0 || value < 0) {
			System.out.println("\nError: wrong input!!! Please choose banknotes with amount: 20$, 50$ or 100$.");
			return false;
		} else if (value % 10 >= 1 && value % 10 <= 9 || value <= 19) {
			System.out.println(wrongAmount);
			return false;
		}

		// >0 0 >0
		if (value % 100 > 0 && value % 50 == 0 && value % 20 > 0) {
			if (amount50 == 0) {
				System.out.println(wrongAmount);
				return false;
			} else {
				while (value % 100 != 0) {
					value -= 50;
					counter50++;
					amount50 -= 1;
				}
				sb.append("\nYou will get: 50$ x " + counter50 + " banknote(s)");
			}
		}

		// >0 >0 0
		if (value % 100 > 0 && value % 50 > 0 && value % 20 == 0) {
			if (amount20 == 0) {
				System.out.println(wrongAmount);
				return false;
			} else {
				while (value % 100 != 0) {
					value -= 20;
					counter20++;
					amount20 -= 1;
				}
				sb.append("\nYou will get: 20$ x " + counter20 + " banknote(s)");
			}
		}

		// >0 >0 >0
		if (value % 100 > 0 && value % 50 > 0 && value % 20 > 0) {			
			if(value > 200) {
				while(value > 200) {
					value = value - 100;
					counter100++;
					amount100 -= 1;
				}				
				sb.append("You will get: 100$ x " + counter100 + " banknote(s)");
				counter100 = 0;
			}						
			value = value - 50;
			counter50++;
			// 0 >0 >0
			if (value % 20 == 0 && amount20 * 20 >= value) {
				while (value != 0 && amount20 != 0) {
					value -= 20;
					counter20++;
					amount20 -= 1;
				}
				amount50 -= 1;
				sb.append("\nYou will get: 50$ x " + counter50 + " banknote(s)");
				counter50 = 0;
				sb.append("\nYou will get: 20$ x " + counter20 + " banknote(s)");
			}

//			// 0 >0 >0
//			if (value % 20 == 0 && amount20 * 20 < value) {
//				
//			}
		}

		if (value % 100 == 0 && value > 0 && amount100 != 0) {
			while (value != 0 && amount100 != 0) {
				value -= 100;
				counter100++;
				amount100 -= 1;
			}
			sb.append("\nYou will get: 100$ x " + counter100 + " banknote(s)");
			counter100 = 0;
		}

		if (value % 50 == 0 && value % 20 == 0) {
			if (amount50 < value && amount20 != 0) {
				if (amount20 != 0 && amount20 * 20 >= value) {
					while (value != 0 && amount20 != 0) {
						value -= 20;
						counter20++;
						amount20 -= 1;
					}
					sb.append("\nYou will get: 20$ x " + counter20 + " banknote(s)");
					counter20 = 0;
				}
			}
		}

		if (value % 50 == 0 && value > 0) {
			while (value != 0 && amount50 != 0) {
				value -= 50;
				counter50++;
				amount50 -= 1;
			}
			if (value > amount50 && value % 20 != 0) {
				System.out.println(wrongAmount);
				return false;
			} else {
				sb.append("\nYou will get: 50$ x " + counter50 + " banknote(s)");
			}
			counter50 = 0;
		}

		if (value % 20 == 0 && value > 0) {
			if (value > amount20 * 20) {
				System.out.println(wrongAmount);
				return false;
			} else {
				while (value != 0 && amount20 != 0) {
					value -= 20;
					counter20++;
					amount20 -= 1;
				}
				sb.append("\nYou will get: 20$ x " + counter20 + " banknote(s)");
			}
			counter20 = 0;
		}

		System.out.println(sb);
		return true;
	}

	public void showLoadingMessage(int value) {
		String loadingMessage = "The ATM checks if " + value + "$ is available in your account...";
		System.out.println(loadingMessage);
	}

	private static int calculateTotalBalance() {
		return amount20 * 20 + amount50 * 50 + amount100 * 100;
	}

	public void showCurrentBalance() {
		System.out.println("Your current balance: " + calculateTotalBalance() + "$.");
	}

}
