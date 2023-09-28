package testpack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActions {
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		
		//-------Entering Username--------------
		WebElement FullName = driver.findElement(By.xpath("//input[@id='userName']"));
		FullName.sendKeys("Gagandeep Singh");
		
		//-------Entering Email--------------
		WebElement Email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		Email.sendKeys("gagan@abc.com");
		
		//-------Entering Current Address--------------
		WebElement Current_Add = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		Current_Add.sendKeys("H.No. 123, Phase 8b Mohali");
		
		//--------Performing Select All in Current Address Text Area-------
		Current_Add.sendKeys(Keys.CONTROL, "a");
		
		//--------Performing Copy action in Current Address Text Area-------
		Current_Add.sendKeys(Keys.CONTROL, "c");
		Current_Add.sendKeys(Keys.TAB);
		
		Thread.sleep(1000);
		//--------Performing Paste action in Permanent Address Text Area-------
		WebElement Permanent_Add = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		Permanent_Add.sendKeys(Keys.CONTROL, "v");
		System.out.println("Keyboard actions are working fine");
	}
}
