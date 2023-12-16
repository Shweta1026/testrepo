package day19oct.keyboardoperation;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.SeleniumUtil;



public class PageScrollingWithKeys2 {

	public static void main(String[] args) throws InterruptedException {
		// using setUp() launch required browser with URL and return browser instance
		WebDriver driver = SeleniumUtil.setUp("chrome", "https://www.flipkart.com/");
		// press ESCAPE button from keyboard to remove login popup
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
		driver.findElement(By.xpath("//span[text()='Mobiles']")).click();
		Thread.sleep(1000);
		// scrolling till bottom of page
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL, Keys.END));
		Thread.sleep(2000);
		// scrolling till top of page
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL, Keys.HOME));
	}

}
