package testpack;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		String strNum = "";
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = inp.nextInt();
		String s1 = String.valueOf(num);
		int sqaure = num*num;
		String s2 = String.valueOf(sqaure);
		System.out.println("Square "+s2);
		int diff = s2.length()-s1.length();
		for(int i=diff; i<s2.length(); i++) {
			strNum = strNum+s2.charAt(i);
		}
//		System.out.println("strNum "+strNum);
		int number = Integer.valueOf(strNum);
		if(num==number) {
			System.out.println(num+" is an automorphic number");
		}else {
			System.out.println(num+" is not an automorphic number");
		}
	}
}
