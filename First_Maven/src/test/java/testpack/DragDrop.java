package testpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDrop {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable/");
		
		WebElement src  = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@class='simple-drop-container']/div[2]/p"));
		Actions action = new Actions(driver);
		action.dragAndDrop(src, target).build().perform();
		if(target.getText().equalsIgnoreCase("Dropped!")) {
			System.out.println("Drag and Drop action is working fine");
		}else {
			System.out.println("Drag and Drop action is not working fine");
		}driver.quit();
	}
}
