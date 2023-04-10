package Java_Inheritance;

public class SubClass1 extends SuperClass1 {
    public static void main(String[] args) {
		    SuperClass1 myCar = new SuperClass1();
		    myCar.honk();
		    System.out.println(myCar.brand + " " + myCar.modelName);
	}
}
