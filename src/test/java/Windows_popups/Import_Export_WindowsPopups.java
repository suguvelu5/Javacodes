package Windows_popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
 * 
 * for Handling Windows Popups.. we can use ROBOT Class using keyboard keys press we can handle it
 * or use AutoIT
 * 
 * or simply use SendKeys to pass the link of the attachment
 * 
 */

public class Import_Export_WindowsPopups {
	

	WebDriver driver;
	
	@BeforeTest
	public void launchbrowser() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Vega\\Downloads\\geckodriver.exe");
		 driver = new FirefoxDriver();
		
			}
	
	@BeforeClass
	public void launchurl() {
		
		driver.get("http://uitestpractice.com/Students/Widgets");
	}
	
	
	@Test
	public void Windows_popups() throws InterruptedException, AWTException {
		
		Thread.sleep(2000);
	
		
		
	WebElement e=driver.findElement(By.xpath("//form[@id='upload_form']/div/div[2]/input"));
	
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].click();", e);
	
	Thread.sleep(2000);
	
	//e.sendKeys("C:\\Users\\Vega\\Desktop\\Sugashini\\Inteview questions\\GIT.txt");
	
	
	Robot robo=new Robot();
	
	robo.keyPress(KeyEvent.VK_S);
	robo.keyRelease(KeyEvent.VK_S);
	robo.keyPress(KeyEvent.VK_U);
	robo.keyRelease(KeyEvent.VK_U);
	robo.keyPress(KeyEvent.VK_DOWN);
	robo.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(3000);
	robo.keyPress(KeyEvent.VK_ENTER);
	robo.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(3000);
	robo.keyPress(KeyEvent.VK_I);
	robo.keyRelease(KeyEvent.VK_I);
	robo.keyPress(KeyEvent.VK_N);
	robo.keyRelease(KeyEvent.VK_N);
	robo.keyPress(KeyEvent.VK_DOWN);
	robo.keyRelease(KeyEvent.VK_DOWN);
	robo.keyPress(KeyEvent.VK_ENTER);
	robo.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(3000);
	robo.keyPress(KeyEvent.VK_H);
	robo.keyRelease(KeyEvent.VK_H);
	robo.keyPress(KeyEvent.VK_C);
	robo.keyRelease(KeyEvent.VK_C);
	robo.keyPress(KeyEvent.VK_L);
	robo.keyRelease(KeyEvent.VK_L);
	
	robo.keyPress(KeyEvent.VK_DOWN);
	robo.keyRelease(KeyEvent.VK_DOWN);
	
	Thread.sleep(3000);
	
	robo.keyPress(KeyEvent.VK_ENTER);
	robo.keyRelease(KeyEvent.VK_ENTER);
	
	
	driver.findElement(By.xpath("//input[@value='Upload']")).click();
	
	
	}

}
