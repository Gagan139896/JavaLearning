package practice_Rev;

public class Revision_2 {

	public static void main(String[] args) {
		int a = 5;
		for(int i=-a; i<=a; i++) {
			for(int j=0; j<=a; j++) {
				if(j<a+i) {
					System.out.print("  ");
				}
//				else if(i<0 && j>a+i) {
//					System.out.print("* ");
//				}
			}
			System.out.println();
		}
	}
}