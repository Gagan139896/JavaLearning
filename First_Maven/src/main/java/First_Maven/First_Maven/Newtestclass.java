package First_Maven.First_Maven;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Newtestclass {
	    public static void main(String[] args) {
	        String alphanumericString = "Task Name: Customer Task, Case Id: 94";
	        Pattern pattern = Pattern.compile("\\d+");
	        Matcher matcher = pattern.matcher(alphanumericString);
	        if (matcher.find()) {
	            String numericValue = matcher.group();
	            int intValue = Integer.parseInt(numericValue);
	            System.out.println("Numeric value: " + numericValue);
	        } else {
	            System.out.println("No numeric value found");
	        }
	    }
	}
