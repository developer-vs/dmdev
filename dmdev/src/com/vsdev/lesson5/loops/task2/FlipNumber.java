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
		int reverseNumber = 0;		
		while(num != 0) {
			reverseNumber = reverseNumber * 10 + num % 10;
			num /= 10;			
		}
		return reverseNumber;
	}
}
