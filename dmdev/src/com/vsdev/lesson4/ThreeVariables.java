package com.vsdev.lesson4;

import java.util.Scanner;

public class ThreeVariables {

	public static void main(String[] args) {

		/**
		 * Даны 3 переменные:
		 * 
		 * - operand1 (double) - operand2 (double) - operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
		 * 
		 * Написать функцию, которая принимает в качестве параметров эти три переменные
		 * и возвращает результат операции. Протестировать функцию в main.
		 * 
		 * Например: Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
		 * Результат: 34.5 (24.4 + 10.1)
		 */
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input first operand: ");
		double operand1 = scanner.nextDouble();
		
		System.out.print("Input second operand: ");
		double operand2 = scanner.nextDouble();
		
		System.out.print("Input your operation (+, -, *, /, %): ");
		char operation = scanner.next().charAt(0);
		
		// Get ASCII number
//		System.out.println((int)operation);

		scanner.close();

		doCalculation(operand1, operand2, operation);
	}
	
	public static void doCalculation(double operand1, double operand2, char operation) {
		switch(operation) {
			case 37:
				System.out.println(operand1 % operand2 + " (" + 
						String.valueOf(operand1) + " % " + 
						String.valueOf(operand2) + ")");
				break;
			case 42:
				System.out.println(operand1 * operand2 + " (" + 
						String.valueOf(operand1) + " * " + 
						String.valueOf(operand2) + ")");
				break;
			case 43:
				System.out.println(operand1 + operand2 + " (" + 
						String.valueOf(operand1) + " + " + 
						String.valueOf(operand2) + ")");
				break;
			case 45:
				System.out.println(operand1 - operand2 + " (" + 
						String.valueOf(operand1) + " - " + 
						String.valueOf(operand2) + ")");
				break;
			case 47:
				System.out.println(operand1 / operand2 + " (" + 
						String.valueOf(operand1) + " / " + 
						String.valueOf(operand2) + ")");
				break;
		}
	}

}
