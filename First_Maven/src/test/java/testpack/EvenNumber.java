package testpack;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = inp.nextInt();
		for(int i=1; i<num; i++) {
			if(i%2==0) {
				System.out.print(i+", ");
			}
		}
	}
}
