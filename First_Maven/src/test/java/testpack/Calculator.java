package testpack;

import java.util.Scanner;

public class Calculator {
	static int ans = 0;
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Start : ");
		int a = inp.nextInt();
		String operation = inp.next();
		int b = inp.nextInt();
		switch (operation){
		case "+":
		  ans=ans+a+b;
		  break;
		case "-":
		  ans=ans+a-b;
		  break;
		case "/":
		  ans=ans+a/b; 
		  break;
		case "*":
		  ans=ans+a*b;
		  break;
		}
		System.out.println(ans);
		int n=0;
		while(n<1) {
			String operation1 = inp.next();
			int c = inp.nextInt();
			switch (operation1){
			case "+":
			  ans=ans+c;
			  break;
			case "-":
			  ans=ans-c;
			  break;
			case "/":
			  ans=ans/c; 
			  break;
			case "*":
			  ans=ans*c;
			  break;
			}
			n=0;
			System.out.println(ans);
		}
	}
}
