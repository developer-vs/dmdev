package com.vsdev.lesson5.loops.task2;

import java.util.Scanner;

public class EvenOdd {

	/**
	 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль. 
	 * Для решения написать 2 функции, которые будут принимать введенное целое число, а
	 * возвращать количество четных цифр (вторая функция - нечетных).
	 * 
	 * Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и
	 * 2 нечетные (9, 1).
	 * 
	 */

	public static void main(String[] args) {		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please input your number: ");
		int number = scanner.nextInt();		
		System.out.println();
		printEvenNumbers(number);
		System.out.println();
		printOddNumbers(number);
		scanner.close();
	}
	
	public static void printEvenNumbers(int num) {
		int lastDigit = 0;
		int currentNumber = num;
		int counter = 0;
		System.out.print("Even numbers are: "); 
		while(currentNumber != 0) {
			lastDigit = currentNumber % 10;
			currentNumber /= 10;
			if(lastDigit % 2 == 0) {
				System.out.print(lastDigit + ", ");
				counter++;
			}
		}
		System.out.println("\nTotal even numbers: " + counter);
	}
	
	public static void printOddNumbers(int num) {
		int lastDigit = 0;
		int currentNumber = num;
		int counter = 0;
		System.out.print("Odd numbers are: "); 
		while(currentNumber != 0) {
			lastDigit = currentNumber % 10;
			currentNumber /= 10;
			if(lastDigit % 2 != 0) {
				System.out.print(lastDigit + ", ");
				counter++;
			}
		}
		System.out.println("\nTotal odd numbers: " + counter);
	}
}
