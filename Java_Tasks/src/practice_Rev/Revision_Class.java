package practice_Rev;

public class Revision_Class {

	public static void main(String[] args) {
		int a = 5;
		for(int i=-a; i<=a; i++) {
			for(int j=0; j<=a; j++) {
				if(i>=j-a && i<=0) {
					System.out.print("* ");
				}
				else if(i>0 && j<=a-i) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
