package Java_Learning;

public class Multiple_Objects {
	int x = 5;
	public static void main(String[] args) {
		Multiple_Objects myObj1 = new Multiple_Objects();  // Object 1
		Multiple_Objects myObj2 = new Multiple_Objects();  // Object 2
		    System.out.println(myObj1.x);
		    System.out.println(myObj2.x);
	}

}
