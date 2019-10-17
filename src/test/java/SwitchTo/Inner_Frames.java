package SwitchTo;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


/*
 * Frames handled by using  INDEX ,ID , NAME , ELEMENT on DOM
 * DefaultContent switching to original page
 * Inner frames means switch to frame by its flow.. manually understand which frame is inside another frame. then occardingly switch to it
 */



public class Inner_Frames {
	
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
	public void getframes() throws InterruptedException {
		
		Thread.sleep(2000);
	List<WebElement> framess=driver.findElements(By.tagName("iframe"));

	for(WebElement e:framess) {
		String s=e.getAttribute("name");
		System.out.println(s);
		
		
if(s.equalsIgnoreCase("iframe_a")) {
		driver.switchTo().frame(0);
			
			
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("is it done");
}
		//driver.switchTo().defaultContent();
		
		driver.switchTo().defaultContent();
			
			WebElement fr=driver.findElement(By.xpath("//a[contains(text(),'uitestpractice.com')]"));
			WebElement frr=driver.findElement(By.xpath("//a[contains(text(),'Opens in a new window')]"));
			
			String ss=frr.getText();
			String sss=fr.getText();
			
		System.out.println(sss);
			System.out.println(ss);
			
			
			
			
		
			
		
		
	}
		
	}
	

}
