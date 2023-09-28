package testpack;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = inp.nextInt();
		int c = num;
		for(int i=1; i<num; i++) {
			c = c*(num-i);
			System.out.println(c);
		}
		System.out.println("Final : "+c);
	}

}
