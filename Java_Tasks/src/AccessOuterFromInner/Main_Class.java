package AccessOuterFromInner;

public class Main_Class {

	public static void main(String[] args) {
		 Outer_Class myOuter = new Outer_Class();
		    Outer_Class.InnerClass myInner = myOuter.new InnerClass();
		    System.out.println(myInner.myInnerMethod());
	}

}
