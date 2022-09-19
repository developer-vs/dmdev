package com.vsdev.lesson4;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {

		/**
		 * Даны два прямоугольных треугольника. Каждый из них задается двумя
		 * целочисленными переменными a и b - стороны треугольника. 
		 * Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади
		 * сравниваются друг с другом.
		 * 
		 * Для этого понадобится написать 2 функции. 
		 * Первая: по двум сторонам прямоугольного треугольника возвращает его площадь. 
		 * Вторая: сравнивает переданные площади двух треугольников и выводит на консоль 
		 * первый треугольник больше, меньше или равен второму. 
		 * Учитывать, что площадь может быть вещественным числом.
		 */
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input the size of side 'a' of the first triangle: ");
		int firstTriangleSideA = scanner.nextInt();
		
		System.out.print("Input the size of side 'b' of the first triangle: ");
		int firstTriangleSideB = scanner.nextInt();
		
		System.out.println();
		
		System.out.print("Input the size of side 'a' of the secondt triangle: ");
		int secondTriangleSideA = scanner.nextInt();
		
		System.out.print("Input the size of side 'b' of the second triangle: ");
		int secondTriangleSideB = scanner.nextInt();
		
		scanner.close();
		
		double areaOfFirstTriangle = getAreaOfTriangle(firstTriangleSideA, firstTriangleSideB);
		double areaOfSecondTriangle = getAreaOfTriangle(secondTriangleSideA, secondTriangleSideB);
		
		System.out.println();
		
		System.out.println("Area of first triangle is: " + areaOfFirstTriangle);
		System.out.println("Area of second triangle is: " + areaOfSecondTriangle);
		compareTwoTriangles(areaOfFirstTriangle, areaOfSecondTriangle);
	}
	
	public static double getAreaOfTriangle(int sideA, int sideB) {
		return 1/2.0 * (sideA * sideB);
	}
	
	public static void compareTwoTriangles(double AreaOfTriangle1, double AreaOfTriangle2) {
		if(AreaOfTriangle1 > AreaOfTriangle2) {
			System.out.println("The area of a first triangle is greater than the area of the second one.");
		} else if(AreaOfTriangle1 < AreaOfTriangle2) {
			System.out.println("The area of a first triangle is less than the area of the second one.");
		} else {
			System.out.println("The area of a first triangle is equal to the area of the second one.");
		}
	}
}
