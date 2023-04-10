package Java_Learning;

public class StaticVsPubllic {
	static void myStaticMethod() {
	    System.out.println("Static methods can be called without creating objects");
	  }
	public void myPublicMethod() {
	    System.out.println("Public methods must be called by creating objects");
	  }
	public static void main(String[] args) {
		myStaticMethod();//Call the static method
		StaticVsPubllic myObj = new StaticVsPubllic(); 
	    myObj.myPublicMethod(); // Call the public method on the object
	  }
}

