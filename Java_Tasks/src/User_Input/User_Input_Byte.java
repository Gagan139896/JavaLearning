package User_Input;

import java.util.Scanner;

public class User_Input_Byte {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
	    System.out.println("Enter any number : ");
	    byte Number6 = myObj.nextByte();
	    System.out.println("You have entered : " + Number6);
	}

}
