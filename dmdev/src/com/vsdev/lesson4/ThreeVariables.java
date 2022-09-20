package com.vsdev.lesson4;

import java.util.Scanner;

public class ThreeVariables {

	public static void main(String[] args) {

		/**
		 * Даны 3 переменные: 
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
		String operation = scanner.next();

		scanner.close();

		double result = doCalculation(operand1, operand2, operation);
		System.out.println("Result: " + result + " (" + 
				String.valueOf(operand1) + " " + 
				operation + " " + 
				String.valueOf(operand2) + ")");
	}
	
	public static double doCalculation(double operand1, double operand2, String operation) {
		double result = 0;
		switch(operation) {
			case "%":
				result = operand1 % operand2;
				break;
			case "*":
				result = operand1 * operand2;
				break;
			case "+":
				result = operand1 + operand2;
				break;
			case "-":
				result = operand1 - operand2;
				break;
			case "/":
				result = operand1 / operand2;
				break;
			default:
				System.out.println("Please input a valid operator!");
		}
		return result;
	}
}
