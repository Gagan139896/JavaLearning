package User_Input;

import java.util.Scanner;

public class User_Input_Boolean {

	public static void main(String[] args) {
		 Scanner myObj = new Scanner(System.in);
		    System.out.println("True or False?");
		    boolean Result = myObj.nextBoolean();
		    System.out.println("Result is: " + Result);
		  }

}
