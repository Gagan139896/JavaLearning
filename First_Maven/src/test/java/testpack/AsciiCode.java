package testpack;

import java.util.Scanner;

public class AsciiCode {

	public static void main(String[] args) {
		int n = 0;
		while(n<1) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter Character : ");
		char c = inp.next().charAt(0);
		int num = (int)c;
		System.out.println("ASCII code of "+c+ "is "+num);
		n=0;
		}
	}
}
