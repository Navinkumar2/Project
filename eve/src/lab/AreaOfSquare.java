package lab;

import java.util.Scanner;

public class AreaOfSquare {
	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter the Side of Square");
		double side=Scan.nextDouble();
		double Area=side*side;
		System.out.println("Area of Square is:"+Area);
	}
}
