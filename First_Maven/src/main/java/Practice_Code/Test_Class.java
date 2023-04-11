package Practice_Code;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test_Class extends MyMaven {

	public static void main(String[] args) {
		MyMaven obj = new MyMaven();
		obj.OpenBrowser();
		obj.driver.get("https://www.rediff.com/");
		driver.switchTo().frame("moneyiframe");
		
		String Count = driver.findElement(By.xpath("//div[@class='celltwo']//span[@class='sensex']")).getText();
		System.out.println(Count);

	}

}
