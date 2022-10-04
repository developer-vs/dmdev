package com.vsdev.oop.strings.hw1;

public class RemoveDuplicateCharacters {

	/**
	 * Дана строка. Удалить из нее все повторяющиеся символы без учета регистра,
	 * если они идут друг за другом. Также удалить пробелы. Результат привести к
	 * верхнему регистру.
	 * 
	 * Например: "abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
	 */

	public static void main(String[] args) {

		String s = "abc Cpddd Dio OsfWw";
		System.out.println("original: " + s);
		System.out.println("modified: " + removeDuplicateCharacters(s));
	}

	public static String removeDuplicateCharacters(String s) {
		s = s.toLowerCase();
		StringBuilder sb = new StringBuilder();
		char lastChar = ' ';

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ' && lastChar != s.charAt(i)) {
				sb.append(s.charAt(i));
				lastChar = s.charAt(i);
			}
		}
		return sb.toString().toUpperCase();
	}
}
