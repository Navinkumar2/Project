package lab;

import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the length of Rectangle:");
		double length=reader.nextDouble();
		System.out.println("Enter the width of Rectangle:");
		double width=reader.nextDouble();
		double Area=length*width;
		System.out.println("Area of Rectangle:"+Area);
	}
}
