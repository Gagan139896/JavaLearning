package Banking_System;

import java.io.IOException;
import java.util.Scanner;

public class Account_Handling extends Reuse_Methods
{
	Scanner inp = new Scanner(System.in);
	//-----------Method for hanling debit transactions---------------
	public void debit(String path, String acc_Num, int row_Count ) throws InterruptedException, IOException 
	{
		double total_Bal=0;
		//----Entering debit amount-----
		System.out.println("Please enter amout : ");
		double debit = inp.nextDouble();
		String deb = Double.toString(debit);
		
		//----If user try to perform debit action first time--------
		if(row_Count<1)
		{
			System.out.println("Insufficient Balance.\nYour account balance is Rs."+0.0);
		}
		
		//----If user want to debit amount from his/her account-------
		else
		{
			//------If Debit amount is less than or equal to Balance amount-------------------
			if(debit<=Double.parseDouble(read_excel(path, acc_Num, excel_RowCount(path, acc_Num), 3)))
			{
				write_Exce23(path, acc_Num, Double.toString(debit), row_Count, 1);
				write_Exce34(path, acc_Num, current_Date(), row_Count, 2);
				total_Bal = Double.parseDouble(read_excel(path, acc_Num, excel_RowCount(path, acc_Num)-1, 3))-debit;
				write_Exce34(path, acc_Num, Double.toString(total_Bal), row_Count, 3);
				System.out.println("Your account is debited by Rs "+debit+". Your current account balance is Rs "+total_Bal);
			}
			
			//-----If Debit amount is greater than Balance amount--------------------------
			else if(debit>Double.parseDouble(read_excel(path, acc_Num, excel_RowCount(path, acc_Num), 3)))
			{
				System.out.println("Insufficient Balance.\nYour account balance is Rs."+read_excel(path, acc_Num, excel_RowCount(path, acc_Num), 3)+"\nPlease try with valid amount");
			}
		}
	}
	
	//---------Method for credit amount-----------
	public void credit(String path, String acc_Num, int row_Count) throws InterruptedException, IOException
	{
		double total_Bal=0;
		
		//-----Entering amount to credit--------
		System.out.println("Please enter amout : ");
		double credit = inp.nextDouble();
		
		//-----Writing credit amount entry in excel sheet in credit column------
		write_Exce23(path, acc_Num, Double.toString(credit), row_Count, 0);
		
		//----If user perform Credit credit action first time-------
		if(row_Count<1)
		{
			total_Bal = 0+credit;
			//----Writing Balance amount in sheet------
			write_Exce34(path, acc_Num, Double.toString(total_Bal), row_Count, 3);
			
			//----Writing transaction date in sheet----
			write_Exce34(path, acc_Num, current_Date(), row_Count, 2);
		}
		
		//-----If user want to credit amount in his/her account-----
		else 
		{
			//----Calculating total balance by adding credit amount and previous balance amount-------
			total_Bal = Double.parseDouble(read_excel(path, acc_Num, excel_RowCount(path, acc_Num)-1, 3))+credit;
			//----Writing Balance amount in sheet------
			write_Exce34(path, acc_Num, Double.toString(total_Bal), row_Count, 3);
			//----Writing transaction date in sheet----
			write_Exce34(path, acc_Num, current_Date(), row_Count, 2);
		}
		System.out.println("Your account is credited with Rs "+credit+". Your current account balance is Rs "+total_Bal);
	}
	
	//---------Method for checking account balance------------------
	public void balanceCheck(String path, String acc_Num, int row_Count, int col_Count) throws InterruptedException, IOException
	{
		String bal = "";
		//-----If user want to check Balance amount first time---------
		if(row_Count<1) 
		{
			write_Exce23(path, acc_Num, "0", row_Count, col_Count-1);
			bal = read_excel(path, acc_Num, excel_RowCount(path, acc_Num), 3);
			
		}
		
		//-----If user checks his/her account balance after making any transaction----
		else
		{
			//-----Getting balance amount from excel sheet------------
			bal = read_excel(path, acc_Num, excel_RowCount(path, acc_Num), 3);
		}
		
		System.out.println("Your current account balance is Rs "+bal);
	}
	
	public void statementCheck(String path, String acc_Num, int row_Count, int col_Count) throws IOException
	{
		System.out.println("Your detailed statement :-");
		for(int i=0; i<=row_Count; i++)
		{
			for(int j=0; j<=col_Count; j++)
			{
				if(j==0)
				{
					System.out.print(read_excel(path, acc_Num, i, j));
				}
				else if(i==0 && j>0)
				{
					System.out.print("      "+read_excel(path, acc_Num, i, j));
				}
				else
				{
					System.out.print("    "+read_excel(path, acc_Num, i, j));	
				}
			}
			System.out.println();
		}
	}
	
}
