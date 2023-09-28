package testpack;

import java.util.Scanner;

public class Word_Rev {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter text :- ");  
//		int num = sc.nextInt();
		String word = sc.nextLine();
		String[] words = word.split(" ");
		System.out.println(words.length);
		
		//---To print "nagag peed" from "Gagan deep"---
		for(int i=0; i<=words.length-1; i++) {
//			System.out.print(words[i]+ " ");
			String a = words[i];
			for(int j=a.length()-1; j>=0;j--) {
				System.out.print(a.charAt(j));
			}
			System.out.print(" ");
		}
		System.out.println();
		
//		//---To print "Deep Gagan" from "Gagan Deep"---
//				for(int i=words.length-1; i>=0; i--) {
//					System.out.print(words[i]+ " ");
//					}
//					System.out.print(" ");
		
		//---To print "peed nagag" from "Gagan deep"---
		for(int i=words.length-1; i>=0; i--) {
			String a = words[i];
			for(int j=a.length()-1; j>=0;j--) {
				System.out.print(a.charAt(j));
			}
			System.out.print(" ");
		}
		System.out.println();
	}
} 