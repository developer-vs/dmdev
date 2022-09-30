package com.vsdev.lesson6.arrays.task2;

import java.util.Arrays;

public class ArrayOfSymbols {

	private static double sumOfNumbers;

	/**
	 * Дан одномерный массив символов. Преобразовать его в одномерный массив чисел,
	 * где число - это код символа (любой символ - это число в памяти компьютера).
	 * Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84,
	 * 113, 57, 43]
	 * 
	 * Далее определить среднее арифметическое всех элементов целочисленного массива
	 * и вывести на консоль только те элементы, которые больше этого среднего
	 * арифметического.
	 */

	public static void main(String[] args) {
		
		char[] symbols = { 'a', '6', 'y', 'P', 'T', 'q', '9', '+' };
		System.out.println(Arrays.toString(findNumbersGreaterThanAverageNumber(symbols)));
	}

	public static int[] convertCharSymbols(char[] charArr) {
		int[] newArr = new int[charArr.length];
		for (int i = 0; i < charArr.length; i++) {
			newArr[i] = charArr[i];
			sumOfNumbers += newArr[i];
		}
		return newArr;
	}

	public static int[] findNumbersGreaterThanAverageNumber(char[] charArr) {
		int[] intArr = convertCharSymbols(charArr);
		double averageNumber = sumOfNumbers / intArr.length;
		int[] newArr = new int[intArr.length];
		int index = 0;
		for (int i = 0; i < intArr.length; i++) {
			if (intArr[i] > averageNumber) {
				newArr[index] = intArr[i];
				index++;
			}
		}
		newArr = Arrays.copyOf(newArr, index);
		return newArr;
	}
}
