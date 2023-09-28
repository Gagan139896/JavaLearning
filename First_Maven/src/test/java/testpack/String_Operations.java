package testpack;

import java.util.Scanner;

public class String_Operations {

	public static void main(String[] args) {
		String rev_Str = "";
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter Text : ");
		String new_Inp = inp.nextLine();
		
////----To reverse a string---
//		for(int i=new_Inp.length()-1; i>=0;i--) {
//			rev_Str = rev_Str + new_Inp.charAt(i);
//			
//		}
//		System.out.println(rev_Str);
		
		String[] c = new_Inp.split(" ");
		for(int i=0; i<c.length;i++) {
			String word = c[i];
			for(int j=0; j<word.length();j++) {
			 System.out.print(word.charAt(j));
//			 System.out.println(word);
			}
			System.out.print(" ");
		}
	}

}
