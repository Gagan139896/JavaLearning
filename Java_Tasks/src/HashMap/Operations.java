package HashMap;

import java.util.HashMap;

public class Operations {

	public static void main(String[] args) {
		
		//Add Items
		 HashMap<String, String> capitalCities = new HashMap<String, String>();
		    capitalCities.put("England", "London");
		    capitalCities.put("Germany", "Berlin");
		    capitalCities.put("Norway", "Oslo");
		    capitalCities.put("USA", "Washington DC");
		    System.out.println(capitalCities);
	    //Access an Item
		    System.out.println(capitalCities.get("England"));
		    
	    //Remove an Item
		    System.out.println(capitalCities.remove("England"));
		    System.out.println(capitalCities);
	    //HashMap Size
		    System.out.println(capitalCities.size());
	    //Loop Through a HashMap
	    // Print keys
		    for (String i : capitalCities.keySet()) {
		      System.out.println("Key : "+i);
		    }
		   // Print values
		      for (String i2 : capitalCities.values()) {
		        System.out.println("Value : "+i2);
	}
		   // Print keys and values
		      for (String i : capitalCities.keySet()) {
		        System.out.println("|| key: " + i + " || value: " + capitalCities.get(i)+" ||");
		      }
		    }
}
