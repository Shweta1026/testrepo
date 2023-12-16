package day19oct.keyboardoperation;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.SeleniumUtil;


public class RefreshPage {

	public static void main(String[] args) throws InterruptedException {
		//using setUp() launch required browser with URL and return browser instance
		WebDriver driver = SeleniumUtil.setUp("chrome", "https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL,"r"));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.F5);
		
	}
}
/*
possible ways to refresh browser window
		ctrl+r --> Keys
		F5	  ---> Keys
		navigate().refresh();
		driver.get()
*/