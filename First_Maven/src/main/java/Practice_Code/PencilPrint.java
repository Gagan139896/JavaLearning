package Practice_Code;
import java.util.Scanner;
public class PencilPrint {
		public void Pencil(int col) {
			int colVal = (2*col)-1;
			for(int i=1;i<=colVal;i++) {
				
//				if(i > col) {
//					col = col - 1;
//				 }
				for(int j=1;j<=col;j++) {
					if(i <= j)  
	                    System.out.print("* ");  
	                else  
	                	System.out.print(" ");
						}
				System.out.println();
					}
	        }
	    public static void main(String[] args) {
	      int col;  
	      Scanner scan = new Scanner(System.in);  
	      System.out.print("Enter Column Value: ");  
	      col = scan.nextInt();  
	      PencilPrint obj = new PencilPrint();  
	      obj.Pencil(col);
	    }
}
