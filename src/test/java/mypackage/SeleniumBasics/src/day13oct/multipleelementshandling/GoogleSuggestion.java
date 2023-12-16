package day13oct.multipleelementshandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.SeleniumUtil;

public class GoogleSuggestion {

	public static void main(String[] args) {
		WebDriver driver=SeleniumUtil.setUp("chrome","https://www.google.com/");
		
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Selenium");
		
		List<WebElement> suggList=driver.findElements(By.xpath("//ul[@class='G43f7e']/li/div/div[2]/div/div/span"));
		
		
		for(int i=0;i<suggList.size();i++) {
			
			System.out.println(suggList.get(i).getText());
		}
	

	}

}
