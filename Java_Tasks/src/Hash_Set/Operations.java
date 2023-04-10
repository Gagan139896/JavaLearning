package Hash_Set;

import java.util.HashSet;

public class Operations {

	public static void main(String[] args) {
		//Add Items
		 HashSet<String> cars = new HashSet<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("BMW");
		    cars.add("Mazda");
		    System.out.println(cars);
		    System.out.println("-------------------------");
	    //Check If an Item Exists
		    System.out.println(cars.contains("Mazda"));
		    System.out.println("-------------------------");
	    //Remove an Item
		    cars.remove("Volvo");
		    System.out.println(cars);
		    System.out.println("-------------------------");
	    //HashSet Size
		    System.out.println(cars.size());
		    System.out.println("-------------------------");
	    //Loop Through a HashSet
		    for (String i : cars) {
		    	  System.out.println(i);
		    	}
		  }
}
