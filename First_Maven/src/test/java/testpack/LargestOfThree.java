package testpack;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter 1st number : ");
		int num1 = inp.nextInt();
		System.out.println("Enter 2nd number : ");
		int num2 = inp.nextInt();
		System.out.println("Enter 3rd number : ");
		int num3 = inp.nextInt();
		if(num1>num2 && num1>num3) {
			System.out.println("Greatest number is : "+num1);
		}else if(num2>num1 && num2>num3) {
			System.out.println("Greatest number is : "+num2);
		}else if(num3>num1 && num3>num2) {
			System.out.println("Greatest number is : "+num3);
		}
	}
}
