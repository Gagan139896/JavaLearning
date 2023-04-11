package testpack;

public class Palindrome {
	public static void main(String args[]){  
		String str = "ram";
		String revStr = " ";
		for(int i=0;i<=str.length();i++) {
	//		char charac = str.charAt(i);
			revStr = revStr + str.charAt(i);
		}
	}
}