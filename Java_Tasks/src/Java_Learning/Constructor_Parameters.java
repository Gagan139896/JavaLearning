package Java_Learning;

public class Constructor_Parameters {
	 int x;

	  public Constructor_Parameters(int y) {
	    x = y;
	  }
	public static void main(String[] args) {
		Constructor_Parameters myObj = new Constructor_Parameters(5);
	    System.out.println(myObj.x);
	  }
}
