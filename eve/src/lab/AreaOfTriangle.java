package lab;

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter the width of Triangle:");
		double base=Scan.nextDouble();
		System.out.println("Enter the height of Triangle:");
		double height=Scan.nextDouble();
		double area=base*height;
		System.out.println("Area of Triangle:"+area);
	}
}
