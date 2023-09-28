package testpack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions action = new Actions(driver);
		WebElement btn = driver.findElement(By.xpath("//span[text()='right click me']"));
		action.contextClick(btn).perform();
		boolean option = driver.findElement(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[3]")).isDisplayed();
		if(option==true) {
		System.out.println("Right click action is working fine");	
		}else {
			System.out.println("Right click action is not working");
		}driver.quit();
	}
}
