package testpack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BookMyShow {

	public static void main(String[] args) {
		 HashMap<Integer,String> seatMap = new  HashMap<Integer,String>();
		 Scanner inp = new Scanner(System.in);
		 System.out.println("Total number of seats");
		 int total_Seats = inp.nextInt();
	        for (int i = 1; i <= total_Seats; i++) {
	        	seatMap.put(i, "Available");
	        }
	        seatMap.put(total_Seats+1, "Booked");
//	        System.out.println(seatMap);
	        System.out.println("How many tickets do you want? :");
	        int seat_Req = inp.nextInt();
	        System.out.println("Seat number of your choice? : ");
	        int seat_Num = inp.nextInt();
	        for(int j=seat_Num; j<seat_Num+seat_Req; j++) {
	        	seatMap.get(j);
	        	System.out.println("Seat number "+j+" is "+seatMap.get(j));
	        	if(seatMap.get(j)=="Booked") {
	        		for(int k=seat_Num-seat_Req; k<seat_Num; k++) {
	        			System.out.println("Seat number "+k+" is "+seatMap.get(k));
	        		}
	        	}
	        }
	}
}
