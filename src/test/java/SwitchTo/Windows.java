package SwitchTo;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
 * Modal window wont be handles by using getwindowhandles.. we can handle it using SwitchTo().ActiveElement();
 * 
 * 
 */


public class Windows {
	

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
	public void windows_handling() throws InterruptedException, AWTException {
		
		driver.findElement(By.xpath("//button[@type='button' and contains(text(),'Launch modal')]")).click();
		
		driver.switchTo().activeElement();
		
		Thread.sleep(30000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			
			
		

}
}
