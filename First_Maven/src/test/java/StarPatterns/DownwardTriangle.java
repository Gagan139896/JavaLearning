package StarPatterns;

import java.util.Scanner;

public class DownwardTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:- ");  
		int rows= sc.nextInt();
		for(int i=1;i<=rows;i++) {
			for(int j=rows-i;j>=0;j--) {
				System.out.print("* ");
			}System.out.println();
			
		}
	}
}
