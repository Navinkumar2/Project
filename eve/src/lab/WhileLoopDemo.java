package lab;

import java.util.Scanner;

public class WhileLoopDemo {
	public static void main(String[] args) {
		int number,sum=0;
		Scanner reader=new Scanner(System.in);
		System.out.println(" Please Enter any valiue below 10");
		number=reader.nextInt();
		while (number<=10) {
			sum=sum+number;
			number++;
		}
				System.out.println("Sum of the Numbers From the While loop is:"+sum);
	}
}
