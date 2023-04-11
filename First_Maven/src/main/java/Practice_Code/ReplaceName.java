package Practice_Code;
import java.util.Scanner;
public class ReplaceName{
	public String Name(String str)
    {
		String rev_str = "";
		String rev_str1 = "";
		for (int i =  0; i < str.length(); i++) {
			int index = str.indexOf(" ");
			if(i>=index+1) {
            	rev_str =  rev_str+str.charAt(i)  ;
			}
			else {
            	rev_str1 =  rev_str1+str.charAt(i)  ;
//            	System.out.println(str.charAt(i));
			}
		}
		return rev_str+" "+rev_str1;
        }
    public static void main(String[] args)
    {
    	System.out.println("Enter Name : ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.toLowerCase();
        ReplaceName Ans = new ReplaceName();
        System.out.println(Ans.Name(str));
    }
}