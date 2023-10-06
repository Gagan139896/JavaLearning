package Banking_System;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class Account_Details extends Reuse_Methods{
	Account_Handling acc_Handling = new Account_Handling();
	
//-------------Method for handling account operations(Credit/Debit/Statement)------------------------	
	public void acc_Operations(String path, String acc_Num) throws IOException, InterruptedException {
		Scanner inp = new Scanner(System.in);
		double total_Bal=0;

		int n = 0;
		while(n<1) {
			System.out.println("Please Enter yout account verification Pin : ");
			String pin = inp.nextLine();
			System.out.println("Enter Bal for Balance, Cre for Credit, Deb for Debit, St for statement : ");
			String operation = inp.nextLine();
			
			String bal ="";
			int row_Count = excel_RowCount(path,acc_Num);
			int col_Count = excel_ColumnCount2(path, acc_Num,row_Count);
				
				//-----Balance Check Operations----------
				if(operation.equalsIgnoreCase("Bal")) 
				{
					acc_Handling.balanceCheck(path, acc_Num, row_Count, col_Count);
				}
				
				//-----Credit Operation------------------
				else if(operation.equalsIgnoreCase("Cre")) 
				{
					acc_Handling.credit(path, acc_Num, row_Count);
				}
				
				//-----Debit opeartion-------------------
				else if(operation.equalsIgnoreCase("Deb")) 
				{
					acc_Handling.debit(path, acc_Num, row_Count);
				}
				
				//-----Getting account statement---------				
				else if(operation.equalsIgnoreCase("St"))
				{
					acc_Handling.statementCheck(path, acc_Num, row_Count, col_Count);
				}
				
				else
				{
					n=0;
				}
		}
	}
	
//------------Method for Opening new account and proceeding with Existing account-------------	
	public void account_Type() throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException {
		ArrayList<String> acc_Details = new ArrayList<>();
		String path = "C:\\Users\\gagandeep.singh_bits\\git\\JavaLearning\\First_Maven\\AccountDetails.xlsx";
		int n=0;
		
		while(n<1) 
		{
			Scanner inp = new Scanner(System.in);
			System.out.println("Please select account type. Enter New to open new account and Old to proceed with Existing account: ");
			String account_Type = inp.nextLine();
			
			if(account_Type.equalsIgnoreCase("New")) 
			{
				System.out.println("Enter your name (Firstname Lastname) : ");
				String name = inp.nextLine();
				acc_Details.add(name);
				System.out.println("Enter your unique id number : ");
				String uniqueID = inp.nextLine();
				acc_Details.add(uniqueID);
				int row_Count = excel_RowCount(path, "AccountNumber");
				int col_Count = excel_ColumnCount2(path, "AccountNumber",row_Count);
				String acc_Pin = String.valueOf(random_number(9999, 0000));
				if(row_Count<1) 
				{
				 String first_acc_Number = "10000";
				 acc_Details.add(first_acc_Number);
				 acc_Details.add(acc_Pin);
					for(int i=0; i<col_Count; i++) 
					{
					   write_Excel2(path, "AccountNumber", acc_Details.get(i), row_Count,i);
					} 
					System.out.println("Your account is created successfully.\nAccount number is : "+first_acc_Number+"\nAccount pin is : "+acc_Pin);
					addNewSheetTab(first_acc_Number, "AccountDetails");
				}
				
				else {
					 boolean is_uniqueID = false;
					for(int i=1; i<=row_Count; i++)
					{  
					
						if(read_excel(path, "AccountNumber", i, 1).equalsIgnoreCase(uniqueID))
						{
							is_uniqueID = true;
							break;
						}
						else
						{
							is_uniqueID = false;
						}
					}
					if(is_uniqueID==true)
					{
						System.out.println("Please verify your account to proceed with Existing account");
						String proceedWithExisting = inp.nextLine();
//						if(proceedWithExisting.equalsIgnoreCase("Yes"))
//						{
////------------Need to call existing account method here-----
//							System.out.println("Proceed with existing account");
//						}
//						else
//						{
//							System.out.println("Thanks for visiting...");
//						n++;
//						}
						n++;
					}
					else if(is_uniqueID==false)
					{
						int new_Acc = (Integer.valueOf(read_excel(path, "AccountNumber", row_Count, 2)))+1;
						acc_Details.add(String.valueOf(new_Acc));
						acc_Details.add(acc_Pin);
						addNewSheetTab(String.valueOf(new_Acc), "AccountDetails");
						for(int i=0; i<col_Count; i++) 
						{
						   write_Excel2(path, "AccountNumber", acc_Details.get(i), row_Count,i);
						} 
						System.out.println("Your account is created successfully.\nAccount number is : "+new_Acc+"\nAccount pin is : "+acc_Pin);
					}
				}	
				n++;
			}
			else if(account_Type.equalsIgnoreCase("Old")) 
			{
				System.out.println("Enter your account number : ");
				String acc_Number = inp.nextLine();
				acc_Operations(path, acc_Number);
				n++;
			}
			else 
			{
				n=0;
			}
		}
	}
	
	public static void main(String[] args) throws IOException, InterruptedException, EncryptedDocumentException, InvalidFormatException {
		Account_Details obj = new Account_Details();
		obj.account_Type();
	}
}
