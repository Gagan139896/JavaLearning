package NumericPatterns;

import java.util.Scanner;

public class NumberPascal {
	static void test3(int rows) {
		int x=1;
		for(int i=1;i<=rows;i++) {
			for(int j=rows-i;j>=1;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(x+" ");
			}System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:- ");  
		int rows= sc.nextInt();
		test3(rows);
	}

}
