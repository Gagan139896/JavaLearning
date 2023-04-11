package Practice_Code;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Class2 extends MyMaven{
	public static void main(String[] args) {
		MyMaven obj = new MyMaven();
		obj.OpenBrowser();
		obj.driver.get("https://www.mykhel.com/cricket/most-sixes-in-odi-rs19/");
		List<WebElement> myElements = driver.findElements(By.xpath("//table[@class='os-cricket-stats-table']/tbody/tr"));
		List<WebElement> myElements2 = driver.findElements(By.xpath("//table[@class='os-cricket-stats-table']/tbody/tr[2]/td"));
		System.out.println(myElements.size());
		System.out.println(myElements2.size());
		for (int i = 2; i <= myElements.size(); i++) {
			String Tbody = driver.findElement(By.xpath("//table[@class='os-cricket-stats-table']/tbody/tr[" + i + "]/td[3]")).getText();
			if (Tbody.equalsIgnoreCase("India")) {
		      for (int j = 2; j <= myElements2.size(); j++) {
		    		  String Bats_details = driver.findElement(By.xpath("//table[@class='os-cricket-stats-table']/tbody/tr[" + i + "]/td["+j+"]")).getText();
		    		  System.out.print(Bats_details);
		    		  System.out.print(" || ");
		    	  }
		      System.out.println();
		      }		    	  
		    	  }
	}
}