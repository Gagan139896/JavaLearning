package testpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.util.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyLanguage {
	Assert as = new Assert();
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://mail.google.com/mail/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='V7i3mf']")).click();
		Thread.sleep(200);
		String Lang1 = driver.findElement(By.xpath("//div[@data-menu-uid='ucj-1']/ul/li[10]/span[2]")).getText();
		driver.findElement(By.xpath("//div[@data-menu-uid='ucj-1']/ul/li[10]")).click();
		Thread.sleep(200);
		String Eng = driver.findElement(By.xpath("//h1[@id='headingText']")).getText();
		System.out.println("Firstly selected language is : "+Eng);
		Thread.sleep(200);
		driver.findElement(By.xpath("//div[@class='V7i3mf']")).click();
		Thread.sleep(200);
		String Lang2 = driver.findElement(By.xpath("//div[@data-menu-uid='ucj-1']/ul/li[5]/span[2]")).getText();
		driver.findElement(By.xpath("//div[@data-menu-uid='ucj-1']/ul/li[5]")).click();
		Thread.sleep(200);
		String Exp = driver.findElement(By.xpath("//h1[@id='headingText']")).getText();
		System.out.println("Newly selected language is : "+Exp);
		if(Eng!=Exp) {
			System.out.println("Language is changed successfully.\nFirstly selected language is : "+Lang1+" newly selected language is : "+Lang2);
		}else {
			System.out.println("");
		}
		
	}
}
