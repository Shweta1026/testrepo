package day4oct.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example7 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getPageSource().length());
	
	WebElement userInputField= driver.findElement(By.name("username"));
	userInputField.sendKeys("Admin");
	
	WebElement passwordInputField= driver.findElement(By.name("password"));
	passwordInputField.sendKeys("admin");
	
	WebElement loginButton= driver.findElement(By.tagName("button"));
	loginButton.click();
		
	}

}

