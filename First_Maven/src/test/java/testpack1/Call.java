package testpack1;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Call {
    public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://mail.google.com/mail/");
		driver.findElement(By.xpath("//div[@class='V7i3mf']")).click();
		for(int i=1;i<=83;i++) {
			WebElement var = driver.findElement(By.xpath("//div[@data-menu-uid='ucj-1']/ul/li["+i+"]"));
			System.out.println(var.getText());
		} 
	}
}