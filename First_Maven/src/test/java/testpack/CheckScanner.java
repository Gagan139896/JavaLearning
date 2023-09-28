package testpack;

import java.util.Scanner;

public class CheckScanner {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int number = 0;

	        while (true) {
	            System.out.print("Enter an integer: ");
	            if (scanner.hasNextInt()) {
	                number = scanner.nextInt();
	                break;
	            } else {
	                System.out.println("Invalid input! Please enter an integer.");
	                scanner.nextLine(); // Clear the input buffer
	            }
	        }

	        System.out.println("You entered: " + number);
	        scanner.close();
	}
}
