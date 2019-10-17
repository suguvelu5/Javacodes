package SwitchTo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


/*
 * 
 * I can handle Alerts in two ways.. one is using Switch To().Alert()
 * another one is Robot class..  you need to know the shortcut key navigation for it on keyboard
 * 
 * 
 */

public class Alerts {
	

	WebDriver driver;
	
	@BeforeTest
	public void launchbrowser() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Vega\\Downloads\\geckodriver.exe");
		 driver = new FirefoxDriver();
		
			}
	
	@BeforeClass
	public void launchurl() {
		
		driver.get("http://uitestpractice.com/Students/Switchto");
	}
	
	
	@Test
	public void Alerts() throws InterruptedException, AWTException {
	
		//driver.findElement(By.xpath("//button[@id='alert']")).click();
		
		
		
		driver.findElement(By.xpath("//button[@id='prompt']")).click();
		
		
		
//	Alert alerts=driver.switchTo().alert();
//	
//	Thread.sleep(3000);
//	alerts.sendKeys("this is alert");
//	Thread.sleep(3000);
//	alerts.accept();
		
		
	 
		Robot robo=new Robot();
		
		robo.keyPress(KeyEvent.VK_T);
		robo.keyRelease(KeyEvent.VK_T);
		robo.keyPress(KeyEvent.VK_H);
		robo.keyRelease(KeyEvent.VK_H);
		robo.keyPress(KeyEvent.VK_I);
		robo.keyRelease(KeyEvent.VK_I);
		robo.keyPress(KeyEvent.VK_S);
		robo.keyRelease(KeyEvent.VK_S);
		
		robo.keyPress(KeyEvent.VK_SPACE);robo.keyRelease(KeyEvent.VK_SPACE);
		robo.keyPress(KeyEvent.VK_I);
		robo.keyRelease(KeyEvent.VK_I);
		robo.keyPress(KeyEvent.VK_S);
		robo.keyRelease(KeyEvent.VK_S);
		
		robo.keyPress(KeyEvent.VK_SPACE);robo.keyRelease(KeyEvent.VK_SPACE);
		robo.keyPress(KeyEvent.VK_R);
		robo.keyRelease(KeyEvent.VK_R);
		robo.keyPress(KeyEvent.VK_O);
		robo.keyRelease(KeyEvent.VK_O);
		robo.keyPress(KeyEvent.VK_B);
		robo.keyRelease(KeyEvent.VK_B);
		robo.keyPress(KeyEvent.VK_O);
		robo.keyRelease(KeyEvent.VK_O);
		robo.keyPress(KeyEvent.VK_T);
		robo.keyRelease(KeyEvent.VK_T);
		
		Thread.sleep(30000);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		
		
//		robo.keyPress(KeyEvent.VK_ESCAPE);
//		robo.keyRelease(KeyEvent.VK_ESCAPE);
	
	
	}

}
