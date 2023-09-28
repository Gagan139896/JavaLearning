package testpack;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.hamcrest.Matcher;

public class ATM_Program {

	public void regEx(String deb) {
//		    String str = "Hello! How are you? #SpecialChars!";
	        Pattern pattern = Pattern.compile("[^a-zA-Z0-9 ]");
	        java.util.regex.Matcher matcher = pattern.matcher("String");

	        while (matcher.find()) {
//	            System.out.println(matcher.group());
	        }
	    }
	public static void main(String[] args) {
		ATM_Program obj = new ATM_Program();
		double total_Bal = 10000;
		int n = 0;
		while(n<3) {
			Scanner inp = new Scanner(System.in);
			System.out.println("Enter PIN : ");
			String pin = inp.nextLine();
			if(pin.equalsIgnoreCase("1234")) {
				System.out.println("Enter Bal for Balance, Cre for Credit, Deb for Debit : ");
				String operation = inp.nextLine();
				n=3;
				if(operation.equalsIgnoreCase("Bal")) {
					System.out.println("Your current account balance is Rs "+total_Bal);
				}
				else if(operation.equalsIgnoreCase("Cre")) {
					System.out.println("Please enter amout : ");
					double credit = inp.nextDouble();
					total_Bal = total_Bal+credit;
					System.out.println("Your account is credited with Rs "+credit+". Your current account balance is Rs "+total_Bal);
				}
				else if(operation.equalsIgnoreCase("Deb")) {
					System.out.println("Please enter amout : ");
					double debit = inp.nextDouble();
					String deb = Double.toString(debit);
					obj.regEx(deb);
						if(debit<=total_Bal) 
						{
							total_Bal = total_Bal-debit;
							System.out.println("Your account has been debited by Rs "+debit+". Your account balance is Rs "+total_Bal);
						}
						else {
							System.out.println("Insufficient balance. Your account balance is Rs "+total_Bal);
							}
					}
				}
			else {
				if(n==0) {
				System.out.println("You have entered invalid pin. Please try again");
				}
				else if(n==1) {
					System.out.println("You have entered invalid pin. You are left with 1 try");
				}else if(n==2)
					System.out.println("Your card is blocked. Please contact your Bank Branch");
				n++;
			}
		}
	}
}
