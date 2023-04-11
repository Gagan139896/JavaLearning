package NumericPatterns;

import java.util.Scanner;

public class SimpleNumber {
	static void test(int rows) {
		for(int i=1;i<=rows;i++) {
			int x=1;
			for(int j=1;j<=i;j++) {
				System.out.print(x+" ");
				x++;
			}System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:- ");  
		int rows= sc.nextInt();
		test(rows);
	}
}
