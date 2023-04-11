package testpack;

import java.util.Scanner;  
import java.lang.Math;  
public class Testing{  
	public static void main(String args[]) {
		double power=0;
		int sum = 0,new_Num=0, total= 0;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number:- ");  
		int arm_Num= sc.nextInt(); 
		int count = String.valueOf(arm_Num).length();
		for(int i =0;i<count;i++) {
			new_Num = arm_Num%10;
			power +=  (Math.pow(new_Num, count));
			sum = (int)power;
			arm_Num = arm_Num/10;
		}System.out.println(sum);
	}
}