package com.vsdev.lesson5.loops.task2;

import java.util.Scanner;

public class FlipNumber {

	/**
	 * Дано целое число. Написать функцию, которая принимает целое число, а
	 * возвращает целое число обратное этому (не строку!). 
	 * Результат вывести на консоль. 
	 * Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
	 * 
	 * Примечание: для решения может понадобится функция возведение числа в 
	 * степень: Math.pow(число, степень)
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please input your number: ");
		int number = scanner.nextInt();
		scanner.close();
		int flipedNumber = flipTheNumber(number);
		System.out.println(flipedNumber);
	}
	
	public static int flipTheNumber(int num) {
		int lastDigit = 0;
		int currentNumber = num;
		String numberAsString = "";
		while(currentNumber != 0) {
			lastDigit = currentNumber % 10;
			currentNumber /= 10;
			if(lastDigit % 2 == 0) { }
			numberAsString += lastDigit;
		}
		return Integer.valueOf(numberAsString);
	}
}
