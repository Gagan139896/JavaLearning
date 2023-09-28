package testpack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick{
	public static WebDriver driver;
	
	public static void main(String[] args) {
		String Exp = "You double clicked me.. Thank You..";
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions action = new Actions(driver);
		WebElement btn = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		action.doubleClick(btn).perform();
		String Act = driver.switchTo().alert().getText();
		if(Exp.equalsIgnoreCase(Act)) {
			System.out.println("Mouse double click action performed successfully");
		}else {
			System.out.println("Mouse double click action is not working");
		}driver.switchTo().alert().accept();
	}

}
