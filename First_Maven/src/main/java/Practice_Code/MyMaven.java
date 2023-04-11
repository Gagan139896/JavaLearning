package Practice_Code;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MyMaven {
	public static WebDriver driver;
//	public MyMaven(){
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//	}
	public void OpenBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		//
//		driver.get("https://www.google.com");	
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
		//driver.quit();
	}
	
}
