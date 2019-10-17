package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebTable {
	
	
	

	@Test
	public void webtables() {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.navigate().to("http://demo.automationtesting.in/WebTable.html");
		
		
		
		String beforexpath="//div[@class='ui-grid-canvas']//div[1][@role='row']/parent::div";
		
		List<WebElement> list=driver.findElements(By.xpath(beforexpath));
		
		for(WebElement e:list) {
			
			System.out.println(e.getText());
			
		}
		
		
	}

}
