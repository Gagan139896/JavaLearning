package AccessOuterFromInner;

public class Outer_Class {
	int x = 10;

	  class InnerClass {
	    public int myInnerMethod() {
	      return x;
	    }
	  }
}
