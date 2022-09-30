package com.vsdev.lesson6.arrays.task2;

import java.util.Arrays;

public class RemoveNegativeNumbers {

	/**
	 * Дан одномерный массив целых чисел. Написать функцию, удаляющую из него все
	 * отрицательные элементы (удалить - значит создать новый массив с только
	 * положительными элементами). После удаления - умножить каждый элемент массива
	 * на его длину. Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
	 */

	public static void main(String[] args) {

		int[] arr = { 3, 5, -6, 3, 2, -9, 0, -123 };
		System.out.println(Arrays.toString(removeNegativeNumbers(arr)));
	}

	private static int[] removeNegativeNumbers(int[] arr) {
		int[] newArr = new int[arr.length];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				newArr[index] = arr[i];
				index++;
			}
		}
		newArr = Arrays.copyOf(newArr, index);
		return multiplyArrayByLength(newArr);
	}

	private static int[] multiplyArrayByLength(int[] arr) {
		int multiplier = arr.length;
		for (int i = 0; i < arr.length; i++) {
			arr[i] *= multiplier;
		}
		return arr;
	}
}
