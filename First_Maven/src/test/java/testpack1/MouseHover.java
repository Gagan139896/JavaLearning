package testpack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/menu/");
		
		Actions actions = new Actions(driver);
		WebElement menuOption = driver.findElement(By.xpath("//a[contains(text(),'Main Item 2')]"));
		actions.moveToElement(menuOption).perform();
		boolean SubOption = driver.findElement(By.xpath("//a[contains(text(),'Main Item 2')]/following::li[1]/a")).isDisplayed();
		if(SubOption==true) {
			System.out.println("Mouse hover action is working fine");
		}else {
			System.out.println("Mouse hover action is not working fine");
		}
		driver.quit();
	}

}
