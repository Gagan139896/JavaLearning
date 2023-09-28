package testpack1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.swing.plaf.basic.BasicTabbedPaneUI.TabSelectionHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Switch {

public static WebDriver driver;
	
	public static void main(String[] args) throws AWTException{
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		Robot robot = new Robot(); 
		
		List<String> list=new ArrayList<String>();
		list.add("https://www.google.com/");
		list.add("https://www.yahoo.com/?guccounter=1");
		list.add("https://www.google.com/");
		
		
        for(int i=0;i<list.size();i++) {
        	
        	robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_T);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_T);
            Set<String> tabs1 = driver.getWindowHandles();
            List<String> tabs2 = new ArrayList<String>();
            tabs2.addAll(tabs1);
            driver.switchTo().window(tabs2.get(i+1)); 
            driver.get(""+list.get(i)+"");
        }
	}
}
