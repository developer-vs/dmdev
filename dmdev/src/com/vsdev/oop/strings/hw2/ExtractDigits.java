package com.vsdev.oop.strings.hw2;

import java.util.Arrays;

public class ExtractDigits {

	/**
	 * Дана строка с текстом, в котором есть цифры от 0 до 9.
	 * 
	 * Написать 2 метода: 
	 * - возвращающий массив цифр из переданной строки 
	 * - возвращающий сумму цифр из переданного целочисленного массива
	 * 
	 * Посчитать сумму всех чисел из строки
	 * 
	 * Например: “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18
	 * (8+1+2+4+3)
	 */

	public static void main(String[] args) {

		String s = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";
		int[] myArr = extractDigits(s);
		System.out.println(Arrays.toString(myArr));
		System.out.println(calculateSum(myArr));
	}

	public static int[] extractDigits(String s) {
		int[] value = new int[s.length()];
		int index = 0;
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
				case '0' -> {value[index] = 0; index++;}
				case '1' -> {value[index] = 1; index++;}
				case '2' -> {value[index] = 2; index++;}
				case '3' -> {value[index] = 3; index++;}
				case '4' -> {value[index] = 4; index++;}
				case '5' -> {value[index] = 5; index++;}
				case '6' -> {value[index] = 6; index++;}
				case '7' -> {value[index] = 7; index++;}
				case '8' -> {value[index] = 8; index++;}
				case '9' -> {value[index] = 9; index++;}
				default -> {}
			}
		}
		return Arrays.copyOf(value, index);
	}
	
	public static int calculateSum(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
