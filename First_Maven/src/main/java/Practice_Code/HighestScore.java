package Practice_Code;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HighestScore extends MyMaven {

	public static void main(String[] args) {
		MyMaven obj = new MyMaven();
		obj.OpenBrowser();
		obj.driver.get("https://www.mykhel.com/cricket/most-sixes-in-odi-rs19/");
		List<WebElement> Count = driver.findElements(By.xpath("//td[contains(text(),'*')]/parent::tr"));
		for(int i=1;i<=Count.size();i++) {
			System.out.print(" || "+Count.get(i).getText());
			System.out.println();
		}
	}
}

