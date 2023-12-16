package day4oct.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example6 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		System.out.println("Current url : "+driver.getCurrentUrl());
		System.out.println("title : "+driver.getTitle());
		System.out.println("pagesource length : "+driver.getPageSource().length());
		
		WebElement userInputField=driver.findElement(By.id("username"));
		userInputField.clear();
		userInputField.sendKeys("admin");
		 
		WebElement passwordInputField=driver.findElement(By.id("password"));
		passwordInputField.clear();
		passwordInputField.sendKeys("admin");
		
		WebElement signinButton=driver.findElement(By.tagName("button"));
		signinButton.click();
		

	}

}
