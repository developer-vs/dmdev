package com.vsdev.lesson4;

import java.util.Scanner;

public class Minute {

	/**
	 * В переменной minutes лежит число от 0 до 59. Написать функцию, которая
	 * принимает в качестве параметра значение переменной minutes и выводит на
	 * консоль в какую четверть часа попадает это число (в первую, вторую, третью
	 * или четвертую).
	 * 
	 * Протестировать функцию в main.
	 * 
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Input minute between 0 - 59: ");
		int minutes = scanner.nextInt();

		scanner.close();

		printQuarterOfHour(minutes);
	}

	public static void printQuarterOfHour(int minutes) {
		if (minutes >= 0 && minutes <= 15) {
			System.out.println("Your number is in the first quarter of hour");
		} else if (minutes >= 16 && minutes <= 30) {
			System.out.println("Your number is in the second quarter of hour");
		} else if (minutes >= 31 && minutes <= 45) {
			System.out.println("Your number is in the third quarter of hour");
		} else if (minutes >= 46 && minutes <= 59) {
			System.out.println("Your number is in the forth quarter of hour");
		} else {
			System.out.println("Please input the right number");
		}
	}
}
