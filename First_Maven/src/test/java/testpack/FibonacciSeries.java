package testpack;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num1 = 0;
		int num2 = 1;
		int num = inp.nextInt();
		while(num1<=num) {
			System.out.print(num1 + " + ");
			int sum = num1+num2;
			num1 = num2;
			num2 = sum;
		}
	}
}
