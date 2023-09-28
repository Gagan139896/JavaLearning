package testpack;

import java.util.Scanner;

public class PetersonNumber {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = inp.nextInt();
		String s = String.valueOf(num);
		int sum = 0;
		for(int i=1; i<=s.length(); i++) {
			int n = Character.getNumericValue(s.charAt(i-1));
			int a = n;
			for(int j=1;j<n;j++) {
				a = a*(n-j);
			}
			sum = sum+a;
		}
		System.out.println("sum "+sum);
		if(num==sum) {
			System.out.println(num+ " is a Peterson Number");
		}else {
			System.out.println(num+ " is not a Peterson Number");
		}
	}
}
