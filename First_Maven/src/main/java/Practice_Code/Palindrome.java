package Practice_Code;
import java.util.Scanner;
public class Palindrome {
	public boolean is_Palindrome(String str)
    {
        String rev_str = "";
        boolean ans = false;
        for (int i = str.length() - 1; i >= 0; i--) {
        	rev_str = rev_str + str.charAt(i);
        }
        System.out.println(rev_str);
        if (str.equals(rev_str)) {
            ans = true;
        }
        return ans;
    }
    public static void main(String[] args)
    {
    	System.out.println("Enter Input to check Plaindrome");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.toLowerCase();
        Palindrome Ans = new Palindrome();
        System.out.println(Ans.is_Palindrome(str));
    }
}

