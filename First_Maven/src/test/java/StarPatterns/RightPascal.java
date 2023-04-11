package StarPatterns;

import java.util.Scanner;

public class RightPascal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:- ");  
		int rows= sc.nextInt();
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}System.out.println();
		}
		for(int i=1;i<=rows;i++) {
			for(int j=rows-i;j>=1;j--) {
				System.out.print("*");
			}System.out.println();
		}
	}

}
