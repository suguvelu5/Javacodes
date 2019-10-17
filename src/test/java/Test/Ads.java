package Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Ads {
	
	
	String s;
	
	@Test
	public void launchbrowser() {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.navigate().to("https://www.guru99.com/parameterization-using-xml-and-dataproviders-selenium.html");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> list=driver.findElements(By.xpath("//iframe[contains(@id,'google_ads')]"));
		
		int li=list.size();
		
		System.out.println(li);
		
		for(WebElement e:list) {
			
			String s=e.getAttribute("src");
			
			System.out.println(s);
			
//			WebDriver driver1=new InternetExplorerDriver();
//			
//			driver1.get(s);
			
		}
		
		
		
		
		
		
	}

}
