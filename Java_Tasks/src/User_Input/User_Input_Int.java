package User_Input;

import java.util.Scanner;

public class User_Input_Int {

	public static void main(String[] args) {
		 Scanner myObj = new Scanner(System.in);
		    System.out.println("Enter any number : ");
		    int Number = myObj.nextInt();
		    System.out.println("You have entered : " + Number);
		  }
}
