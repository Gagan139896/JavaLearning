package testpack;
import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String args[]) {
		double power=0;
		int sum,total = 0;
		int mul = 1;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number:- ");  
		int arm_Num= sc.nextInt(); 
		int count = String.valueOf(arm_Num).length();
		String string_number = Integer.toString(arm_Num);
		for(int i =0;i<count;i++) {
			char digit = string_number.charAt(i);
			int digits = Integer.parseInt(String.valueOf(digit));
//			power = Math.pow(digits, count);
			for(int j=0;j<count;j++) {
				mul = digits*mul;
//			sum = (int)power;
//			total=sum+total;  
			}
			System.out.println(mul);
			total=mul+total; 
			mul =1;
		}
		
		if(arm_Num==total) {
			System.out.println("'"+arm_Num+"' is an Armstrong Number");
		}else {
			System.out.println("'"+arm_Num+"' is not an Armstrong Number.\nBecause total sum of the powers of this number is '"+total+"'");
		}
	}
}

