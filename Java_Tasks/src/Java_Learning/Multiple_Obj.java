package Java_Learning;

public class Multiple_Obj {
	int x = 5;
	public static void main(String[] args) {
		Multiple_Obj myObj1 = new Multiple_Obj();
		Multiple_Obj myObj2 = new Multiple_Obj();
	    myObj2.x = 25;
	    System.out.println(myObj1.x);
	    System.out.println(myObj2.x);
	}

}
