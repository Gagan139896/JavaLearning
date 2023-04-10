package User_Input;

import java.util.Scanner;

public class User_Input_Short {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
	    System.out.println("Enter any number : ");
	    short Number5 = myObj.nextShort();
	    System.out.println("You have entered : " + Number5);
	}
}
