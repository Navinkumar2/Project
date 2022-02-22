package lab;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		int num;
		System.out.println("Enter the Integer :");
		Scanner reader=new Scanner(System.in);
		num=reader.nextInt();
		if(num%2==0)
			System.out.println("Entered number is Even");
		else
			System.out.println("Entered number is Odd");
		
	}
}
