package day19oct.keyboardoperation;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.SeleniumUtil;



public class PressEscButton {

	public static void main(String[] args) throws InterruptedException {
		//using setUp() launch required browser with URL and return browser instance
		WebDriver driver=SeleniumUtil.setUp("chrome","https://www.flipkart.com/");
		//press EXCAPE button from keyboard to remove login popup
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
		
	}

}

