package Java_Learning;

public class Java_Contructor {
	int x;
	public Java_Contructor() {
	    x = 5;
	}
	public static void main(String[] args) {
		Java_Contructor myObj = new Java_Contructor();// Create an object of class Main (This will call the constructor)
	    System.out.println(myObj.x);
	}
}
