package day4oct.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCart {

	public static void main(String[] args) {
	 WebDriver driver= new ChromeDriver();
	 
	 driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
	 System.out.println(driver.getCurrentUrl());
	 System.out.println(driver.getTitle());
	 System.out.println(driver.getPageSource().length());
	 
	 WebElement userInputField=driver.findElement(By.id("input-email"));
	 userInputField.sendKeys("shweta");
	 
	 WebElement passwordInputField=driver.findElement(By.id("input-password"));
	 passwordInputField.sendKeys("1234");

	 WebElement loginButton=driver.findElement(By.tagName("button"));
	 loginButton.click();
	 
	 WebElement searchInput=driver.findElement(By.name("search"));
	 searchInput.sendKeys("HP LP3065");
	 
	 WebElement searchButton=driver.findElement(By.tagName("button"));
	 searchButton.click();
	}

}