package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class table {
	

	public static void main(String[] args) {
		
		
        WebDriver driver=new FirefoxDriver();
		
		driver.navigate().to("http://demo.automationtesting.in/WebTable.html");
		
		
		
		String beforexpath="//div[@class='ui-grid-canvas']//div[1]/div[6]//following-sibling::div//button/i";
		
		List<WebElement> list=driver.findElements(By.xpath(beforexpath));
		
		int l=list.size();
		System.out.println(l);
		
		for(WebElement e:list) {
			
			Actions action=new Actions(driver);
			action.clickAndHold(e);
			
		}
		
	
	}

}
