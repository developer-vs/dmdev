package com.vsdev.lesson6.arrays.task2;

import java.util.Arrays;

public class ThreeArrays {

	/**
	 * Дан одномерный массив целых чисел.
	 * 
	 * Написать функцию, которая принимает этот массив и разбивает на 3 других: с
	 * только отрицательными числами, только положительными и только нули. Если для
	 * какого-то из массивов не будет значений, то должен быть создан пустой массив.
	 * Возвращает функция эти три массива в виде одного двумерного.
	 * 
	 * Пример:
	 * 
	 * 							   [-4, -18]
	 * 
	 * [-4, 0, 1, 9, 0, -18, 3] -> [0, 0]
	 * 
	 * 							   [1, 9, 3]
	 */

	public static void main(String[] args) {
		
		int[] values = {-4, 0, 1, 9, 0, -18, 3};
		int[][] sortedArray = sortNumbersInArray(values);
		printSortedArray(sortedArray);
	}
	
	public static int[][] sortNumbersInArray(int[] arr) {
		int[] negativeNumbers = new int[arr.length];
		int[] onlyZeroNumbers = new int[arr.length];
		int[] positiveNumbers = new int[arr.length];
		int negativeNumbersCounter = 0;
		int onlyZeroNumbersCounter = 0;
		int positiveNumbersCounter = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < 0) {
				negativeNumbers[negativeNumbersCounter] = arr[i];
				negativeNumbersCounter++;
			} else if(arr[i] == 0) {
				onlyZeroNumbers[onlyZeroNumbersCounter] = arr[i];
				onlyZeroNumbersCounter++;
			} else if(arr[i] > 0) {
				positiveNumbers[positiveNumbersCounter] = arr[i];
				positiveNumbersCounter++;
			} else {
				int[] emptyArray = {};
			}
		}
		negativeNumbers = Arrays.copyOf(negativeNumbers, negativeNumbersCounter);
		onlyZeroNumbers = Arrays.copyOf(onlyZeroNumbers, onlyZeroNumbersCounter);
		positiveNumbers = Arrays.copyOf(positiveNumbers, positiveNumbersCounter);
		
		int newArr[][] = {negativeNumbers, onlyZeroNumbers, positiveNumbers};
		
		return newArr;
	}
	
	public static void printSortedArray(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}
